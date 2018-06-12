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
public class FunFragment extends Fragment {

    private TextView headerText;

    public FunFragment() {
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

        final ArrayList<Cite> cites = new ArrayList<Cite>();
        cites.add(new Cite(R.drawable.volley, "FIVB Volleyball Men's World Championship", "Sep 10 - Sep 30"));
        cites.add(new Cite(R.drawable.na_tamno, "Na Tamno", "2, \"Stefan Stambolov\" Str.\nwww.natamno.com"));
        cites.add(new Cite(R.drawable.three_lions, "Three Lions Pub", "41,  \"Knyaz Aleksander Batenberg\" Str."));
        cites.add(new Cite(R.drawable.cubo, "Cubo", "9000, \"Primorski\" Blv."));
        cites.add(new Cite(R.drawable.menthol, "Menthol", "9000, \"Primorski\" Blv."));
        cites.add(new Cite(R.drawable.sundogs, "Sundogs", "1, \"Mihail Koloni\" Str."));
        cites.add(new Cite(R.drawable.indian, "Indian Bar", "22, \"Petar Parchevich\" Str."));
        cites.add(new Cite(R.drawable.social_teahouse, "The Social Teahouse", "53, \"Preslav\" Str."));
        cites.add(new Cite(R.drawable.rubic, "Rubik Art Center", "5, \"Primorski\" Blv."));
        cites.add(new Cite(R.drawable.dockers, "Dockers Club", "27, \"Primorski\" Blv."));



        /// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        CiteAdapter adapter = new CiteAdapter(getActivity(), cites, R.color.category_fun);

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
