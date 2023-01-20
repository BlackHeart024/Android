package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assignment_2 extends AppCompatActivity {
    Button btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);

        btn16 = (Button) findViewById(R.id.prg16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog16.class);
                startActivity(i);
            }
        });

        btn17 = (Button) findViewById(R.id.prg17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog17.class);
                startActivity(i);
            }
        });

        btn18 = (Button) findViewById(R.id.prg18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog18.class);
                startActivity(i);
            }
        });

        btn19 = (Button) findViewById(R.id.prg19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog19.class);
                startActivity(i);
            }
        });

        btn20 = (Button) findViewById(R.id.prg20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog20.class);
                startActivity(i);
            }
        });

        btn21 = (Button) findViewById(R.id.prg21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog21.class);
                startActivity(i);
            }
        });

        btn22 = (Button) findViewById(R.id.prg22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog22.class);
                startActivity(i);
            }
        });

        btn23 = (Button) findViewById(R.id.prg23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog23.class);
                startActivity(i);
            }
        });

        btn24 = (Button) findViewById(R.id.prg24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog24.class);
                startActivity(i);
            }
        });

        btn25 = (Button) findViewById(R.id.prg25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog25.class);
                startActivity(i);
            }
        });

        btn26 = (Button) findViewById(R.id.prg26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog26.class);
                startActivity(i);
            }
        });

        btn27 = (Button) findViewById(R.id.prg27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog27.class);
                startActivity(i);
            }
        });

        btn28 = (Button) findViewById(R.id.prg28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog28.class);
                startActivity(i);
            }
        });

        btn29 = (Button) findViewById(R.id.prg29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog29.class);
                startActivity(i);
            }
        });

        btn30 = (Button) findViewById(R.id.prg30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_2.this, prog30.class);
                startActivity(i);
            }
        });
    }
}