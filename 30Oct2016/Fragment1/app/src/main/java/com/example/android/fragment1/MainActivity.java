package com.example.android.fragment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestFragment fragment = new TestFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content,fragment)
                .commit();

        AnotherFragment anotherFragment = new AnotherFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content2,anotherFragment)
                .commit();





    }
}
