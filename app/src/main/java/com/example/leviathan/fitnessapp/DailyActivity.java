package com.example.leviathan.fitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class DailyActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tw;
    MyApplication app;


    public void onClick(View v) {
        tw.setText("!!!!!!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        app =  (MyApplication) getApplication();




        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);
    }


}
