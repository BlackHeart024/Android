package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class prog14 extends AppCompatActivity {
    private EditText ed1, ed2, ed3;
    Button btnsq, btnrec, btntri, btncir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog14);
        addListenerOnButton();
    }public void addListenerOnButton() {
        ed1 = (EditText) findViewById(R.id.len);
        ed2 = (EditText) findViewById(R.id.hei);
        ed3 = (EditText) findViewById(R.id.rad);

        btnsq = (Button) findViewById(R.id.sq);
        btnsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                float l = Float.parseFloat(value1);
                float sq = l * l;
                Toast.makeText(prog14.this, String.valueOf(sq), Toast.LENGTH_SHORT).show();
            }
        });

        btnrec = (Button) findViewById(R.id.rec);
        btnrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                float l = Float.parseFloat(value1);
                float h = Float.parseFloat(value2);
                float rec = l * h;
                Toast.makeText(prog14.this, String.valueOf(rec), Toast.LENGTH_SHORT).show();
            }
        });

        btntri = (Button) findViewById(R.id.tri);
        btntri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                float l = Float.parseFloat(value1);
                float h = Float.parseFloat(value2);
                float tri = (l * h) / 2;
                Toast.makeText(prog14.this, String.valueOf(tri), Toast.LENGTH_SHORT).show();
            }
        });

        btncir = (Button) findViewById(R.id.cir);
        btncir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed3.getText().toString();
                float r = Float.parseFloat(value1);
                double cir = (3.14 * r * r);
                Toast.makeText(prog14.this, String.valueOf(cir), Toast.LENGTH_SHORT).show();
            }
        });
    }
}