package com.example.roskata.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.cite_list, container, false);

//        headerText = (TextView) getActivity().findViewById(R.id.toolbar_text);
//        headerText.setText("Nature");

        final ArrayList<Cite> cites = new ArrayList<>();
        cites.add(new Cite(R.drawable.archeological, getString(R.string.archaeological_museum), getString(R.string.archaeological_museum_address)));
        cites.add(new Cite(R.drawable.ethnographical, getString(R.string.ethnographic_museum), getString(R.string.ethnographic_museum_address)));
        cites.add(new Cite(R.drawable.necropolis, getString(R.string.varna_necropolis), getString(R.string.varna_necropolis_address)));
        cites.add(new Cite(R.drawable.varnenchik, getString(R.string.vladislav_varnenchik_museum),getString(R.string.vladislav_varnenchik_museum_address)));
        cites.add(new Cite(R.drawable.naval, getString(R.string.naval_museum), getString(R.string.naval_museum_address)));
        cites.add(new Cite(R.drawable.aquarium, getString(R.string.aquarium), getString(R.string.aquarium_address)));
        cites.add(new Cite(R.drawable.puppets, getString(R.string.puppets_museum), getString(R.string.puppets_museum_address)));
        cites.add(new Cite(R.drawable.roman_baths, getString(R.string.roman_baths),getString(R.string.roman_baths_address)));
        cites.add(new Cite(R.drawable.observatory, getString(R.string.observatory_museum), getString(R.string.observatory_museum_address)));



        /// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CiteAdapter adapter = new CiteAdapter(getActivity(), cites, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_colors.xml layout file.
        final ListView listView = rootView.findViewById(R.id.list);

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
