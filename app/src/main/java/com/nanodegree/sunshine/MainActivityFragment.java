package com.nanodegree.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> data = new ArrayList<>();
        data.add("Mon 6/23 - Sunny - 31/17");
        data.add("Tue 6/24 - Foggy - 21/8");
        data.add("Wed 6/25 - Cloudy - 22/17");
        data.add("Thurs 6/26 - Rainy - 18/11");
        data.add("Fri 6/27 - Foggy - 21/10");
        data.add("Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, data);
        ListView listView = (ListView) rootview.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);
        return rootview;
        // return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
