package com.example.android.listview1;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 10/23/2016.
 */
public class CustomAdapter extends ArrayAdapter<User> {
    private ArrayList<User> userList;
    public CustomAdapter(Context ctx, ArrayList<User> myList){
        super(ctx, 0, myList);
        userList = myList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            Log.d("MAIN" , "Convert view null");
            v = LayoutInflater.from(getContext()).inflate(R.layout.custom_row, parent, false);
        } else {
            Log.d("MAIN" , "Convert view NOT null");
        }
        User u = userList.get(position);
        TextView name = (TextView) v.findViewById(R.id.userName);
        TextView contactNumber = (TextView) v.findViewById(R.id.contactNumber);


        name.setText(u.name);
        contactNumber.setText("" + u.contactNumber);
        return v;
        //return super.getView(position, convertView, parent);
    }
}
