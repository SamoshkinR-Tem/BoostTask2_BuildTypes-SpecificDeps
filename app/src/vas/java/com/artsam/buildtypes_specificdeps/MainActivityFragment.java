package com.artsam.buildtypes_specificdeps;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] catNames = getResources().getStringArray(R.array.cat_names);

        View root = inflater.inflate(R.layout.fragment_main, container);

        RecyclerView recView = (RecyclerView) root.findViewById(R.id.rec_view);
        recView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recView.setLayoutManager(mLayoutManager);

        recView.setAdapter(new MyAdapter(catNames));
        return root;
    }
}