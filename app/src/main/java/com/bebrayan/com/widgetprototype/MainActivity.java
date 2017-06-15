package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

    private CheckBox checkBox1,checkBox2,checkBox3;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);

        button = (Button) findViewById(R.id.button1);

    }

    public void choiceColor(View view){
        if(checkBox1.isChecked() == true &&
                checkBox2.isChecked()==false &&
                checkBox3.isChecked()==false ){
                //Merah #F44336
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#F44336"));
        }
        else if(checkBox1.isChecked() == false &&
                checkBox2.isChecked()== true &&
                checkBox3.isChecked()== false){

        }
        else if(checkBox1.isChecked() == true &&
                checkBox2.isChecked()==true &&
                checkBox3.isChecked()==true ){
            Toast.makeText(this,"Memilih Semua Warna",Toast.LENGTH_SHORT).show();
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#ffffff"));
        }else if(checkBox1.isChecked() == false &&
                checkBox2.isChecked()==true &&
                checkBox3.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#007E56"));
        }else if(checkBox1.isChecked() == true &&
                checkBox2.isChecked()== false &&
                checkBox3.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00B500"));
        }
    }
}
