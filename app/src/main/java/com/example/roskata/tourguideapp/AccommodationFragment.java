package com.example.roskata.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccommodationFragment extends Fragment {

    private TextView headerText;

    private android.support.v7.widget.Toolbar toolbar;

    public AccommodationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentx
        View rootView = inflater.inflate(R.layout.cite_list, container, false);

        toolbar = (android.support.v7.widget.Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(R.drawable.accommodation);

        headerText = (TextView) getActivity().findViewById(R.id.toolbar_text);
        headerText.setText(R.string.accommodation_label);

        final ArrayList<Cite> cites = new ArrayList<Cite>();
        cites.add(new Cite(R.drawable.yohohostel, getString(R.string.yo_ho_hostel), getString(R.string.yoho_address)));
        cites.add(new Cite(R.drawable.del_mare, getString(R.string.del_mar_hostel), getString(R.string.del_mar_address)));
        cites.add(new Cite(R.drawable.x_hostel, getString(R.string.xhostel_hostel), getString(R.string.xhostel_address)));
        cites.add(new Cite(R.drawable.avocado, getString(R.string.avocado_hostel), getString(R.string.avocado_address)));


        /// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CiteAdapter adapter = new CiteAdapter(getActivity(), cites, R.color.category_accommodation);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_colors.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), SingleItemActivity.class);
                intent.putExtra(getString(R.string.cite_name_label), ((Cite) listView.getItemAtPosition(position)).getCiteLabel());
                startActivity(intent);
            }
        });

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
