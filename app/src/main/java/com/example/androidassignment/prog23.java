package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class prog23 extends AppCompatActivity {
    TextView timetv;
    TimePicker timepicker;
    Button changetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog23);

        timetv=(TextView)findViewById(R.id.tvct);
        timepicker=(TimePicker)findViewById(R.id.timePicker);
        timepicker.setIs24HourView(true);
        changetime=(Button)findViewById(R.id.btnct);

        timetv.setText(getCurrentTime());

        changetime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                timetv.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime(){
        String currentTime="Current Time: " + timepicker.getCurrentHour() + ":" + timepicker.getCurrentMinute();
        return currentTime;

    }
}