package com.example.android.demolifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editView1);
        if(savedInstanceState != null) {
            editText.setText(savedInstanceState.getString("First"));
        }
        else {
            editText.setText("No data");
        }

        Log.d("MAIN", "onCreate");




    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MAIN", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MAIN", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MAIN", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MAIN", "onPause");
    }
/*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("First",editText.getText().toString());
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MAIN", "onDestroy");
    }
}
