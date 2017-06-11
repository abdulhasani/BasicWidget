package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends Activity {

    private TimePicker timePicker;
    private TextView displayTime;
    private Button changeTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        displayTime = (TextView) findViewById(R.id.textView);
        changeTime = (Button) findViewById(R.id.bchange_time);

        timePicker.setIs24HourView(true);
        displayTime.setText(currentTime());
        changeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTime.setText(currentTime());
            }
        });
    }

    private String currentTime(){
        String mcurrentTime = "Time : "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return mcurrentTime;
    }
}
