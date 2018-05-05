package com.example.android.sftourgiude;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.catg_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.glenCacnyonPark), getString(R.string.addres1) ,
                getString(R.string.phone1), R.drawable.glencanyonpark));
        places.add(new Place(getString(R.string.golden_gate_national_park), getString(R.string.addres2) ,
                getString(R.string.phone2), R.drawable.golden_gate_national_park));
        places.add(new Place(getString(R.string.golden_gate_park), getString(R.string.addres3) ,
                getString(R.string.phone3), R.drawable.golden_gate_park));
        places.add(new Place(getString(R.string.missions_park), getString(R.string.addres4) ,
                getString(R.string.phone4), R.drawable.missions_park));
        places.add(new Place(getString(R.string.john_mclaren), getString(R.string.address5) ,
                getString(R.string.phone5), R.drawable.john_mclaren));
        places.add(new Place(getString(R.string.mountain_ake), getString(R.string.adress6) ,
                getString(R.string.phone6), R.drawable.mountain_ake));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        placeAdapter adapter = new placeAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        gridView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on

        return rootView;
    }

}
