package com.example.android.db1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> myAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addRow = (Button) findViewById(R.id.btn_addRecord);
        Button fetchRows = (Button) findViewById(R.id.btn_fetchRecords);
        final EditText txtProductName = (EditText) findViewById(R.id.txtProductName);
        final EditText txtProductPrice = (EditText) findViewById(R.id.txtProuctPrice);
        final ListView mylist = (ListView) findViewById(R.id.list1);
        final DBHelper mDBDbHelper = new DBHelper(this);

        addRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product product = new Product(txtProductName.getText().toString(), Integer.parseInt(txtProductPrice.getText().toString()));
                mDBDbHelper.insertRow(product);
            }
        });
        fetchRows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> myListString = new ArrayList<String>() ;

                ArrayList<Product> productList =  mDBDbHelper.readDB();
                String s;
                for(Product a : productList){
                    myListString.add(a.getName()+ ", "+a.getPrice());
                }
                myAdapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1,myListString);
                mylist.setAdapter(myAdapter);
            }
        });

    }
}
