package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;

public class MainActivity extends Activity {

    private AnalogClock analogClock;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = (AnalogClock) findViewById(R.id.analogClock);
        button = (Button) findViewById(R.id.button);
        analogClock.setVisibility(View.INVISIBLE);

    }

    public void onButtonClicked(View view){
        button.setText("Analog Clock");
        analogClock.setVisibility(View.INVISIBLE);
    }
}
