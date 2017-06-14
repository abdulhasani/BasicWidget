package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

    private String[]fruits = {
            "Anggur","Apel","Belimbing","Ceri"
            ,"Durian","Jambu","Jeruk","Kecapi"
            ,"Mangga","Nanas","Pisang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapterFruit = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,fruits);
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocompletetextview1);
        actv.setThreshold(1);
        actv.setAdapter(adapterFruit);
        actv.setTextColor(Color.GREEN);
    }
}
