package com.example.android.demonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent ii = getIntent();
        String msg = ii.getStringExtra("MESSAGE");
        int a = ii.getIntExtra("HELLO",0);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }
}
