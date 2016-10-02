package com.example.android.demointents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendEmail(View view) {
        String adr[] = new String[1];
        adr[0] = "abc@gmail.com";
        composeEmail(adr,"Hello Subject");
    }


    public void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, "Hello this is email message");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"No application Found",Toast.LENGTH_SHORT).show();
        }
    }

    public void showMap(View view) {
        //Uri geoLocation = Uri.parse("geo:24.8747373,67.0355272");
        Uri geoLocation = Uri.parse("geo:0,0?q=Sir+Syed+University");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
