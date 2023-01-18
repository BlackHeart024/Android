package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class prog12 extends AppCompatActivity {
    Button b1;
    EditText et;
    ToggleButton tb;
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog12);

        et = (EditText) findViewById(R.id.editTextNumber);
        tb = (ToggleButton) findViewById(R.id.cur);
        b1 = (Button) findViewById(R.id.con);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty()) {
                    Toast.makeText(prog12.this, "Please enter the temperature", Toast.LENGTH_SHORT).show();
                }
                else if(tb.isChecked()) {
                    a = Float.parseFloat(String.valueOf(et.getText()));
                    Float b=a*9/5+32;
                    String r=String.valueOf(b);
                    Toast.makeText(prog12.this, r+"F", Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Float.parseFloat(String.valueOf(et.getText()));
                    Float b=a-32;
                    Float c=b*5/9;
                    String r=String.valueOf(c);
                    Toast.makeText(prog12.this, r+"C", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}