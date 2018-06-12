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

    private TextView headerText;

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

        final ArrayList<Cite> cites = new ArrayList<Cite>();
        cites.add(new Cite(R.drawable.archeological, "Archaeological Museum", "41, \"Maria Luiza\" Blv.\n10AP - 5PM"));
        cites.add(new Cite(R.drawable.ethnographical, "Ethnographic Museum", "22, \"Panagyurishte\" Str.\n10AP - 5PM"));
        cites.add(new Cite(R.drawable.necropolis, "Varna Necropolis", "53, \"Usta Kolyu Ficheto\" Str.\n9AP - 6PM"));
        cites.add(new Cite(R.drawable.varnenchik, "Park Museum \"Vladislav Varnenchik\"", "1, \"Yan Huniyadi\" Blv.\n9:30AP - 6:30PM"));
        cites.add(new Cite(R.drawable.naval, "Naval Museum", "2, \"Primorski\" Blv.\n10AP - 6PM"));
        cites.add(new Cite(R.drawable.aquarium, "Varna Aquarium", "4, \"Primorski\" Blv.\n10AP - 5PM"));
        cites.add(new Cite(R.drawable.puppets, "Varna Puppet Museum", "5, \"Sheinovo\" Str.\n10AP - 5PM"));
        cites.add(new Cite(R.drawable.roman_baths, "Roman Thermae", "\"San Stefano\" Str.\n10AP - 5PM"));
        cites.add(new Cite(R.drawable.observatory, "Astronomical Observatory and Planetarium Copernicus", "9002, \"Primorski\" Blv.\n10AP - 5PM"));



        /// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CiteAdapter adapter = new CiteAdapter(getActivity(), cites, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_colors.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), SingleItemActivity.class);
                intent.putExtra("CiteName", ((Cite) listView.getItemAtPosition(position)).getCiteLabel());
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
