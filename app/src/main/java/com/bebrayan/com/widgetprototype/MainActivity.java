package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener{

        private String firstItem = String.valueOf(spinner1.getSelectedItem());

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if(firstItem.equals(String.valueOf(spinner1.getSelectedItem()))){

            }else {
                Toast.makeText(parent.getContext(),"Your choose : "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }


}
