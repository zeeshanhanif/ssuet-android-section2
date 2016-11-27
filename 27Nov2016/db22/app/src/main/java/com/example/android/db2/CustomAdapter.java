package com.example.android.db2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 11/27/2016.
 */
public class CustomAdapter extends ArrayAdapter<Product> {
    public CustomAdapter(Context context, ArrayList products) {
        super(context, 0, products);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View v = LayoutInflater.from(getContext()).inflate(R.layout.products_list, parent, false);

        TextView txtProductID = (TextView) v.findViewById(R.id.txtProductID);
        TextView txtProductName = (TextView) v.findViewById(R.id.txtProductName);
        TextView txtProductPrice = (TextView) v.findViewById(R.id.txtProductPrice);

        Button btnDeleteProduct = (Button) v.findViewById(R.id.btnDeleteProduct);

        txtProductID.setText("" +getItem(position).getId());
        txtProductName.setText(getItem(position).getName());
        txtProductPrice.setText("" +getItem(position).getPrice());

        btnDeleteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper helper = new DBHelper(getContext());
                helper.deleteProductById(getItem(position).getId());
                Toast.makeText(getContext(), "Product Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
