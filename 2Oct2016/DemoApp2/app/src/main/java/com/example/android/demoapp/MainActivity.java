package com.example.android.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHere(View view) {
        EditText textBox = (EditText) findViewById(R.id.textBox);
        String st = getResources().getString(R.string.lastName);
        //getResources().getDimension(R.dimen.textViewSize1)
        //Toast.makeText(this,st,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,R.string.hello,Toast.LENGTH_SHORT).show();
    }
}










