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
        cites.add(new Cite(R.drawable.volley, getString(R.string.volley), getString(R.string.volley_calendar)));
        cites.add(new Cite(R.drawable.na_tamno, getString(R.string.na_tamno), getString(R.string.na_tamno_address)));
        cites.add(new Cite(R.drawable.three_lions, getString(R.string.three_lions_pub), getString(R.string.three_lions_address)));
        cites.add(new Cite(R.drawable.cubo, getString(R.string.cubo), getString(R.string.cubo_address)));
        cites.add(new Cite(R.drawable.menthol, getString(R.string.menthol), getString(R.string.menthol_address)));
        cites.add(new Cite(R.drawable.sundogs, getString(R.string.sundogs), getString(R.string.sundogs_address)));
        cites.add(new Cite(R.drawable.indian, getString(R.string.indian_bar), getString(R.string.indian_bar_address)));
        cites.add(new Cite(R.drawable.social_teahouse, getString(R.string.the_social_teahouse), getString(R.string.the_social_teahouse_address)));
        cites.add(new Cite(R.drawable.rubic, getString(R.string.rubik), getString(R.string.rubik_address)));
        cites.add(new Cite(R.drawable.dockers, getString(R.string.dockers_club), getString(R.string.dockers_club)));



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
