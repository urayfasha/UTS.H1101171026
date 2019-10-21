package com.example.utsh1101171026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class komponensiaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponensiaran);
    }
    public void open7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/android/android_broadcast_receivers.htm"));
        startActivity(browserIntent);
    }
    public void open8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id"));
        startActivity(browserIntent);
    }
}
