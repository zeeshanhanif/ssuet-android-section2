package com.example.android.demonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("MESSAGE", "Message from activity 1 to 2");
        i.putExtra("HELLO",34);
        startActivity(i);
    }

    public void changeActivity2(View view) {
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
}
