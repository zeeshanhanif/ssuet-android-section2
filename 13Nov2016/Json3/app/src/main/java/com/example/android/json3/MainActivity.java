package com.example.android.json3;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextUrl = (EditText) findViewById(R.id.editTextUrl);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                MyTasks task = new MyTasks();
                task.execute(editTextUrl.getText().toString());
            }
        });

    }


    public String getHTTPData(String strUrl){

        try {
            URL url = new URL(strUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            InputStream stream = urlConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(stream);
            BufferedReader bf = new BufferedReader(isr);

            String allLines = "";
            while(true){
                String line = bf.readLine();
                if(line == null){
                    break;
                }
                allLines += line;
            }

            return allLines;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public EarthQuakeInfo convertJSONToObject(String jsonStr){
        try {
            JSONObject jsonObject = new JSONObject(jsonStr);

            String type = jsonObject.getString("type");
            JSONObject metaJsonObject = jsonObject.getJSONObject("metadata");
            String title = metaJsonObject.getString("title");
            JSONArray features = jsonObject.getJSONArray("features");
            JSONObject featureItem = features.getJSONObject(0);
            JSONObject properties = featureItem.getJSONObject("properties");

            String magnitude = properties.getString("mag");
            String place = properties.getString("place");

            EarthQuakeInfo info = new EarthQuakeInfo(type, title, magnitude, place);
            return info;

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    class MyTasks extends AsyncTask<String, Void, EarthQuakeInfo>{

        @Override
        protected EarthQuakeInfo doInBackground(String... params) {
            String data = getHTTPData(params[0]);
            EarthQuakeInfo info = convertJSONToObject(data);
            return info;
        }

        @Override
        protected void onPostExecute(EarthQuakeInfo info) {
            Log.d("Response ", info.getMagnitude());
            Log.d("Response ", info.getPlace());
            Toast.makeText(MainActivity.this,"Hello" + info.getTitle(),Toast.LENGTH_SHORT).show();
        }
    }





}
