package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class prog07 extends AppCompatActivity {
    DatePicker picker;
    Button displaydate;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog07);

        tv = (TextView) findViewById(R.id.date);
        picker = (DatePicker) findViewById(R.id.datePicker);
        displaydate = (Button) findViewById(R.id.cd);

        tv.setText("Current Date: "+getCurrentDate());

        displaydate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Change Date: "+getCurrentDate());
            }
        });
    }
    public String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append(picker.getDayOfMonth() + "/");
        builder.append((picker.getMonth() + 1) + "/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}