package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity {

    private DatePicker datePicker;
    private TextView displayDate;
    private Button changeDate;
    private int month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        displayDate = (TextView) findViewById(R.id.display_date);
        displayDate.setText("Display Date");
        changeDate = (Button) findViewById(R.id.change_date_button);

        displayDate.setText(currentDate());

        changeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayDate.setText(currentDate());
            }
        });

    }

    private String currentDate(){
        StringBuilder mcurrentDate = new StringBuilder();
        month = datePicker.getMonth() + 1;
        mcurrentDate.append("Date : "+month+"/"+datePicker.getDayOfMonth()+"/"+datePicker.getYear());
        return mcurrentDate.toString();
    }
}
