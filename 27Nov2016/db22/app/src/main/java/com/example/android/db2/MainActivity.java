package com.example.android.db2;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list_products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtSearchProduct = (EditText) findViewById(R.id.txtSearchProduct);
        final EditText txtProductName = (EditText) findViewById(R.id.txtProductName);
        final EditText txtProductPrice = (EditText) findViewById(R.id.txtProductPrice);
        Button btnSetProduct = (Button) findViewById(R.id.btnSetProduct);
        Button btnGetProducts = (Button) findViewById(R.id.btnGetProducts);
        Button btnSearchProduct = (Button) findViewById(R.id.btnSearchProduct);
        list_products = (ListView) findViewById(R.id.list_products);


        btnSearchProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper helper = new DBHelper(MainActivity.this);
                // For search by id
                ArrayList<Product> products = helper.searchByID(Integer.parseInt(txtSearchProduct.getText().toString()));
                // for search by name
                //ArrayList<Product> products = helper.searchByName(txtSearchProduct.getText().toString());
                // for search by name
                //ArrayList<Product> products = helper.searchByPrice(Integer.parseInt(txtSearchProduct.getText().toString()));
                setAdapter(products);
            }
        });


        btnSetProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product product = new Product(txtProductName.getText().toString(), Integer.parseInt(txtProductPrice.getText().toString()));
                DBHelper helper = new DBHelper(MainActivity.this);
                helper.insertRow(product);
            }
        });

        btnGetProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DBHelper helper = new DBHelper(MainActivity.this);
                ArrayList<Product> products = helper.readDB();
                setAdapter(products);
            }
        });

    }


    public void setAdapter(ArrayList<Product> products){
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, products);
        list_products.setAdapter(adapter);
    }
}
