package com.example.utsh1101171026;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickKomponen1(View view){
        Intent intent1 = new Intent(this,komponenaktivitas.class);
        startActivity(intent1);
    }

    public void ClickKomponen2(View view){
        Intent intent2 = new Intent(this,komponenlayanan.class);
        startActivity(intent2);
    }

    public void ClickKomponen3(View view){
        Intent intent3 = new Intent(this,komponensiaran.class);
        startActivity(intent3);
    }

    public void ClickKomponen4(View view){
        Intent intent4 = new Intent(this,komponenmateri.class);
        startActivity(intent4);
    }

    public void ClickKomponen5(View view){
        Intent intent5 = new Intent(this,activity_komponentintent.class);
        startActivity(intent5);
    }
}