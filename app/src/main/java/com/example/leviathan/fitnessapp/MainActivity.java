package com.example.leviathan.fitnessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tw;
    MyApplication app;
    EditText editText;
    Button myButton;
    MySimpleArrayAdapter adapter;

    public void onClick(View v) {
        tw.setText("!!!!!!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        app =  (MyApplication) getApplication();

        myButton = (Button)findViewById(R.id.saveButton);
        editText = (EditText)findViewById(R.id.editText);

        ListView yourListView = (ListView) findViewById(R.id.listId);
        adapter = new MySimpleArrayAdapter(this, R.layout.rowlayout, app.data);
        yourListView.setAdapter(adapter);

        myButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                WorkOutActivity item = new WorkOutActivity();
                item.comment = editText.getText().toString();
                app.data.add(item);
                adapter.notifyDataSetChanged();
            }
        });


    }
}
