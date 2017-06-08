package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleButton(View view){
        Toast.makeText(getApplicationContext(),"Ini adalah Button Sederhana",Toast.LENGTH_SHORT).show();
    }

    public void leftIconButton(View view){
        Toast.makeText(getApplicationContext(),"Button dengan icon dikiri",Toast.LENGTH_SHORT).show();
    }

    public void rigthIconButton(View view){
        Toast.makeText(getApplicationContext(),"Button dengan icon dikanan",Toast.LENGTH_SHORT).show();
    }

    public void backgroundImageButton(View view){
        Toast.makeText(getApplicationContext(),"Button dengan gambar latar",Toast.LENGTH_SHORT).show();
    }

    public void borderButton(View view){
        Toast.makeText(getApplicationContext(),"Button dengan Border Color",Toast.LENGTH_SHORT).show();
    }
}
