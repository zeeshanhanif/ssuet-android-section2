package com.example.android.json1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

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
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name","Xyz");
                    jsonObject.put("age",15);
                    jsonObject.put("isFeePaid",true);
                    jsonObject.put("GPA","2.9");


                    JSONArray jsonArray = new JSONArray();
                    jsonArray.put("Java");
                    jsonArray.put("Android");
                    jsonArray.put("C#");
                    jsonArray.put("Python");

                    jsonObject.put("courses",jsonArray);

                    String data = jsonObject.toString();

                    Toast.makeText(MainActivity.this,"Data : "+data,Toast.LENGTH_SHORT).show();
                    Log.d("JSON","Data = "+data);

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
