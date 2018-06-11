package com.example.roskata.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CiteAdapter extends ArrayAdapter<Cite> {
    /**
     * Resource ID for the background color for this list of words
     * */
    private int mColorResourceId;

    /**
     * Create a new {@link CiteAdapter} object.
     *  @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param cites is the list of {@link Cite}s to be displayed.
     */
    public CiteAdapter(Activity context, ArrayList<Cite> cites, int colorResourceId) {
        super(context, 0, cites);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get {@link Cite} object located in this position in the list
        Cite currentCite = getItem(position);

        //find the image view for every word
        ImageView citeImageView = (ImageView) listItemView.findViewById(R.id.list_icon_item);
        if (currentCite.hasImage()) {
            citeImageView.setImageResource(currentCite.getImageResourceId());
        } else {
            citeImageView.setVisibility(View.GONE);
        }

        TextView citeLabel = (TextView) listItemView.findViewById(R.id.cites_label);
        //Get Cite description for the current object and set this text on the Cite TextView
        assert currentCite != null;
        citeLabel.setText(currentCite.getCiteLabel());

        TextView citeDescription = (TextView) listItemView.findViewById(R.id.cites_address);
        //Get Cite description for the current object and set this text on the Cite TextView
        assert currentCite != null;
        citeDescription.setText(currentCite.getCiteText());

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int bgColor = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(bgColor);

        //Return the whole list item layout (containing 2 TextViews) so thet it can be shown in the ListView
        return listItemView;
    }
}
