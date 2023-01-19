package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class prog06_2 extends AppCompatActivity {
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog062);

        tv1 = findViewById(R.id.rname);
        tv2 = findViewById(R.id.remail);
        tv3 = findViewById(R.id.rpass);

        Intent i = getIntent();
        String gname = i.getStringExtra("sname");
        String gemail = i.getStringExtra("semail");
        String gpass = i.getStringExtra("spass");

        tv1.setText(gname);
        tv2.setText(gemail);
        tv3.setText(gpass);
    }
}