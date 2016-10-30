package com.example.android.fragment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TestFragment.FirstFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestFragment fragment = new TestFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content,fragment)
                .commit();


    }

    @Override
    public void sendData(String message) {
        Toast.makeText(this,"Called From Fragment = "+message,Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(message);
    }
}
