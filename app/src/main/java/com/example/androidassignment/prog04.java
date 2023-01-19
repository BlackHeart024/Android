package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class prog04 extends AppCompatActivity {
    Button b1;
    EditText et;
    ToggleButton tb;
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog04);
        et = (EditText) findViewById(R.id.c1);
        tb = (ToggleButton) findViewById(R.id.cur);
        b1 = (Button) findViewById(R.id.cursub);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty()) {
                    Toast.makeText(prog04.this, "Please enter the currency", Toast.LENGTH_SHORT).show();
                }
                else if(tb.isChecked()) {
                    a = Float.parseFloat(String.valueOf(et.getText()));
                    Float b=a*82;
                    String r=String.valueOf(b);
                    Toast.makeText(prog04.this, r+"D", Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Float.parseFloat(String.valueOf(et.getText()));
                    Float b=a/82;
                    String r=String.valueOf(b);
                    Toast.makeText(prog04.this, r+"R", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}