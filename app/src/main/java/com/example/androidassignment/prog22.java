package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class prog22 extends AppCompatActivity {
    private DatePicker picker;
    private Button displayDate;
    private TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog22);

        textview1=(TextView)findViewById(R.id.currentdate);
        picker=(DatePicker)findViewById(R.id.datePicker);
        displayDate=(Button)findViewById(R.id.changedate);

        textview1.setText("Current Date: \n"+getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText("Change Date: \n"+getCurrentDate());
            }
        });
    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();
        builder.append(picker.getDayOfMonth()+"/");
        builder.append((picker.getMonth() + 1)+"/");
        builder.append(picker.getYear());
        return builder.toString();

    }
}