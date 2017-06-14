package com.bebrayan.com.widgetprototype;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnStartProgress;
    private ProgressDialog progressBar;
    private int progressBarStatus = 0 ;
    private Handler progressBarHandler = new Handler();
    private int fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick(){
        btnStartProgress = (Button) findViewById(R.id.button1);
        btnStartProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar = new ProgressDialog(v.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("Loading . . .");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
                //reset progressbar dan filestatus
                progressBarStatus = 0;
                fileSize = 0 ;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressBarStatus < 100 ){
                                progressBarStatus = doOperation();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            progressBarHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressBarStatus);
                                }
                            });

                            if(progressBarStatus >= 100){
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                progressBar.dismiss();
                            }
                        }
                    }
                }).start();
            }
        });
    }

    private int doOperation(){
        while (fileSize <= 10000){
            fileSize++;
            switch ((int) fileSize){
                case 1000:
                    return 10;
                case 2000:
                    return 20;
                case 3000:
                    return 30;
                case 4000:
                    return 40;
                default:
                    return 100;
            }
        }
        return 100;
    }


}
