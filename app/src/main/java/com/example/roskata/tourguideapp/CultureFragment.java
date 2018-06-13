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
public class CultureFragment extends Fragment {

    private TextView headerText;

    public CultureFragment() {
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
//        headerText.setText("Culture");

        final ArrayList<Cite> cites = new ArrayList<Cite>();
        cites.add(new Cite(R.drawable.varna_summer, getString(R.string.varna_summer_int_music_fest), getString(R.string.varna_summer_int_music_fest_calendar)));
        cites.add(new Cite(R.drawable.theatral_fest, getString(R.string.int_theater_fest), getString(R.string.int_theater_fest_calendar)));
        cites.add(new Cite(R.drawable.ballet, getString(R.string.int_ballet_fest), getString(R.string.int_ballet_fest)));
        cites.add(new Cite(R.drawable.jazz, getString(R.string.int_jazz_fest), getString(R.string.int_jazz_fest_calendar)));
        cites.add(new Cite(R.drawable.folk, getString(R.string.int_folk_fest), getString(R.string.int_folk_fest_calendar)));
        cites.add(new Cite(R.drawable.print, getString(R.string.print_fest), getString(R.string.print_calendar)));
        cites.add(new Cite(R.drawable.radar, getString(R.string.radar_fest), getString(R.string.radar_fest_calendar)));
        cites.add(new Cite(R.drawable.cor_caroli, getString(R.string.cor_caroli), getString(R.string.cor_caroli_calendar)));
        cites.add(new Cite(R.drawable.love, getString(R.string.love_is_folly), getString(R.string.love_is_folly_calendar)));
        cites.add(new Cite(R.drawable.red_cross, getString(R.string.red_cross_film_fest), getString(R.string.red_cross_film_fest_calendar)));
        cites.add(new Cite(R.drawable.golden_rose, getString(R.string.golden_rose), getString(R.string.golden_rose_calendar)));


        /// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CiteAdapter adapter = new CiteAdapter(getActivity(), cites, R.color.category_culture);

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
