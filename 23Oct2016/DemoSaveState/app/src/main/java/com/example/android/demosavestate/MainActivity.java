package com.example.android.demosavestate;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    String[] questions = new String[]{
            "First Question",
            "Second Question",
            "Third Question",
            "Fourth Question"
    };

    private static final String PREF_FILE = "myprefFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MAIN", "onCreate");

        if(savedInstanceState != null){
            Toast.makeText(this, "Inside bundle != null", Toast.LENGTH_LONG).show();
            counter = savedInstanceState.getInt("COUNTER");

        } else {
            Toast.makeText(this, "Inside bundle == null", Toast.LENGTH_LONG).show();
            SharedPreferences preferences = getSharedPreferences(PREF_FILE,0);
            counter = preferences.getInt("COUNTER",0);
        }

        final TextView questionsView = (TextView) findViewById(R.id.txt_question);
        questionsView.setText(questions[counter]);
        Button btn = (Button) findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                questionsView.setText(questions[counter]);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MAIN", "onPause");
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
        SharedPreferences preferences = getSharedPreferences(PREF_FILE,0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("COUNTER",counter);
        editor.commit();
        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MAIN", "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNTER" , counter);
    }
}
