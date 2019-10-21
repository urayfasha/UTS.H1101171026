package com.example.utsh1101171026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class komponenlayanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponenlayanan);
    }
    public void open3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/service-element"));
        startActivity(browserIntent);
    }
    public void open4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id"));
        startActivity(browserIntent);
    }
}
