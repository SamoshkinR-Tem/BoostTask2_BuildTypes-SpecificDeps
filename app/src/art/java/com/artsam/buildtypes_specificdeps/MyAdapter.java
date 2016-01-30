package com.artsam.buildtypes_specificdeps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

    Context mContext;
    LayoutInflater mInflater;
    String[] mObjects;

    public MyAdapter(Context ctx, String[] objects) {
        this.mContext = ctx;
        this.mObjects = objects;
        this.mInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mObjects.length;
    }

    @Override
    public Object getItem(int position) {
        return mObjects[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if(view == null){
            view = mInflater.inflate(R.layout.my_text_view, parent, false);
        }

        TextView textView = (TextView) view.findViewById(R.id.tv_card);
        textView.setText(mObjects[position]);
        return view;
    }
}