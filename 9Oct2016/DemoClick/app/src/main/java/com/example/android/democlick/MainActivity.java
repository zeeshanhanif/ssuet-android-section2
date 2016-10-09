package com.example.android.democlick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.btn1);
        Button b2 = (Button) findViewById(R.id.btn2);
        Button b3 = (Button) findViewById(R.id.btn3);
        CustomClickListener c1 = new CustomClickListener();
        b1.setOnClickListener(c1);
        b2.setOnClickListener(this);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello world 3", Toast.LENGTH_SHORT).show();
            }
        });




    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Hello world 2", Toast.LENGTH_SHORT).show();
    }

    public class CustomClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Hello world 1", Toast.LENGTH_SHORT).show();
        }
    }
}
