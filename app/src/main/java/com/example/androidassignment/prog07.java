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

        tv.setText("Current Year: "+getCurrentDate());

        displaydate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cyear = 2023;
                int byear = (picker.getYear());
                int age = cyear-byear;
                tv.setText("Your age is: "+age);
            }
        });
    }
    public Integer getCurrentDate() {
        int curyear = (picker.getYear());
        return curyear;
    }
}