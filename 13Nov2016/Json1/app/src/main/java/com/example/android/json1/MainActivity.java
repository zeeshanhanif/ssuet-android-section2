package com.example.android.json1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String json = "{'name':'Abc','age':'14'}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();

                try {
                    JSONObject jsonObject = new JSONObject(json);
                    String name = jsonObject.getString("name");
                    jsonObject.has("ag");
                    int age = jsonObject.getInt("ag");

                    Toast.makeText(MainActivity.this,"Data -- Name : "+name,Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,"Data -- Age : "+age,Toast.LENGTH_SHORT).show();


                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
