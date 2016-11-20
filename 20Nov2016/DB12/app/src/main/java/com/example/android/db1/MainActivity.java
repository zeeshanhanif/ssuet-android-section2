package com.example.android.db1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addRow = (Button) findViewById(R.id.btn_addRecord);
        Button fetchRows = (Button) findViewById(R.id.btn_fetchRecords);
        final DBHelper mDBDbHelper = new DBHelper(this);


        addRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDBDbHelper.insertRow();
            }
        });
        fetchRows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDBDbHelper.readDB();
            }
        });

    }
}
