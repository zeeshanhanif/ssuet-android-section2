package com.example.android.async1;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private EditText editText1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        addListeners();


    }

    public void initComponents(){
        textView1 = (TextView) findViewById(R.id.textView1);
        editText1 = (EditText) findViewById(R.id.editText1);
        btn1 = (Button) findViewById(R.id.btn1);
    }

    public void addListeners(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello btn1",Toast.LENGTH_SHORT).show();
                int num = Integer.parseInt(editText1.getText().toString());
                /*for(int i=0;i<num;i++){
                    Log.d("Task","Data = "+i);
                }*/
                MyTask task = new MyTask();
                task.execute(num);
            }
        });
    }

    public class MyTask extends AsyncTask<Integer,String,Integer>{

        @Override
        protected Integer doInBackground(Integer... params) {

            int index = 0;
            for(int i=0;i<params[0];i++){
                Log.d("Task","Data = "+i);
                index += i * 4;
                publishProgress("Updated Data = "+i);
            }
            return index;
        }

        @Override
        protected void onPostExecute(Integer result) {
            Toast.makeText(MainActivity.this,"AsyncTask Completed = "+result,Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onProgressUpdate(String... values) {
            textView1.setText(values[0]);
        }
    }

}
