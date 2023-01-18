package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.prg1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog01.class);
                startActivity(i);
            }
        });

        btn2 = (Button) findViewById(R.id.prg2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog02.class);
                startActivity(i);
            }
        });

        btn3 = (Button) findViewById(R.id.prg3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog03.class);
                startActivity(i);
            }
        });

        btn4 = (Button) findViewById(R.id.prg4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog04.class);
                startActivity(i);
            }
        });

        btn5 = (Button) findViewById(R.id.prg5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog05.class);
                startActivity(i);
            }
        });

        btn6 = (Button) findViewById(R.id.prg6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog06.class);
                startActivity(i);
            }
        });

        btn7 = (Button) findViewById(R.id.prg7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog07.class);
                startActivity(i);
            }
        });

        btn8 = (Button) findViewById(R.id.prg8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog08.class);
                startActivity(i);
            }
        });

        btn12 = (Button) findViewById(R.id.prg12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, prog12.class);
                startActivity(i);
            }
        });
    }
}