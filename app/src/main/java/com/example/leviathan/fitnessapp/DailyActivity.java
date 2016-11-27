package com.example.leviathan.fitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DailyActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tw;

    MyApplication app;



    public void onClick(View v) {
        tw.setText("!!!!!!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MyApplication app = (MyApplication) getApplication();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);
    }


}
