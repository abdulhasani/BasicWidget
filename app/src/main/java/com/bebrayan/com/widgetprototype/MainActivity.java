package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Switch switchButton,switchButton2;
    private TextView textView,textView2;
    private String switchOn = "Switch is On";
    private String switchOf = "Switch is Of";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For first switch button
        switchButton = (Switch) findViewById(R.id.switchButton);
        textView = (TextView) findViewById(R.id.textView);


        switchButton.setChecked(true);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText(switchOn);
                }else{
                    textView.setText(switchOf);
                }
            }
        });


        if(switchButton.isChecked()){
            textView.setText(switchOn);
        }else{
            textView.setText(switchOf);
        }

        //for second switch button
        switchButton2 = (Switch) findViewById(R.id.switchBUtton2);
        textView2 = (TextView) findViewById(R.id.textView2);

        switchButton2.setChecked(false);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView2.setText(switchOn);
                }else{
                    textView2.setText(switchOf);
                }
            }
        });

        if(switchButton2.isChecked()){
            textView2.setText(switchOn);
        }else{
            textView2.setText(switchOf);
        }

    }


}
