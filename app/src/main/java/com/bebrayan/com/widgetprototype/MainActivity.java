package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {

    private RatingBar ratingBar1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar1 = (RatingBar) findViewById(R.id.ratingbar1);
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingBar1.getRating());
                Toast.makeText(getApplication(),rating,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
