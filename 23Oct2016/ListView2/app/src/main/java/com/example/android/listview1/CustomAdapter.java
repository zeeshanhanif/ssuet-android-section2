package com.example.android.listview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 10/23/2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    private ArrayList<String> strList;
    public CustomAdapter(Context ctx, ArrayList<String> myList){
        super(ctx, 0, myList);
        strList = myList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(getContext()).inflate(R.layout.custom_row, parent, false);

        TextView tv = (TextView) v.findViewById(R.id.txt01);
        tv.setText(strList.get(position));
        return v;
        //return super.getView(position, convertView, parent);
    }
}
