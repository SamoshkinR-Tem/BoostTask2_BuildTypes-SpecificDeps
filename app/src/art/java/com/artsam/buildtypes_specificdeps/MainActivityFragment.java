package com.artsam.buildtypes_specificdeps;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] catNames = getResources().getStringArray(R.array.cat_names);

        View root = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) root.findViewById(R.id.list_view);
//        listView.setAdapter(new ArrayAdapter<>(getContext(),
//                android.R.layout.simple_list_item_1, catNames));
        listView.setAdapter(new MyAdapter(getContext(), catNames));
        return root;
    }
}