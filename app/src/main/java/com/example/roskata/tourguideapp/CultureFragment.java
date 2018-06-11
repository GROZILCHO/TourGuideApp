package com.example.roskata.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        cites.add(new Cite(R.drawable.varna_summer, "\"Varna Summer\" International Music Festival", "Jun 24 - Sep 20"));
        cites.add(new Cite(R.drawable.theatral_fest, "International Theatre Festival \"Varna Summer\"", "Jun 24 - Sep 20"));
        cites.add(new Cite(R.drawable.ballet, "28th International Ballet Competition", "Jul 15 - Jul 30"));
        cites.add(new Cite(R.drawable.jazz, "26th INTERNATIONAL JAZZ FESTIVAL", "Jul 26 - Jul 29"));
        cites.add(new Cite(R.drawable.folk, "International Folklore Festival \"Varna Summer\"", "Jul 29 - Aug 02"));
        cites.add(new Cite(R.drawable.print, "XIX International Print Biennial", "Jul 01 - Sep 30"));
        cites.add(new Cite(R.drawable.radar, "RADAR Festival", "Aug 10 - Aug 13"));
        cites.add(new Cite(R.drawable.cor_caroli, "International regatta \"Cor Caroli\" 2018", "Aug 12 - Aug 15"));
        cites.add(new Cite(R.drawable.love, "Love is folly - International Film Festival", "Aug 24 - Sep 01"));
        cites.add(new Cite(R.drawable.red_cross, "17th Festival Of Red Cross And Health Films", "Sep 01 - Sep 30"));
        cites.add(new Cite(R.drawable.golden_rose, "Golden Rose Bulgarian Feature Film Fest", "Oct 01 - Oct 30"));


        /// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CiteAdapter adapter = new CiteAdapter(getActivity(), cites, R.color.transparent);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_colors.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
