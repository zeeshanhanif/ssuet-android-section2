package com.example.android.demofindview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitInfo(View view){
        EditText edit_name = (EditText) findViewById(R.id.editText_name);
        String name1 = edit_name.getText().toString();

        TextView textView_name = (TextView)findViewById(R.id.textView_name);
        textView_name.setText(name1);
        textView_name.setTextSize(50);

        Toast.makeText(this,name1,Toast.LENGTH_SHORT).show();

    }
}
