package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assignment_1 extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);

        btn1 = (Button) findViewById(R.id.prg1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog01.class);
                startActivity(i);
            }
        });

        btn2 = (Button) findViewById(R.id.prg2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog02.class);
                startActivity(i);
            }
        });

        btn3 = (Button) findViewById(R.id.prg3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog03.class);
                startActivity(i);
            }
        });

        btn4 = (Button) findViewById(R.id.prg4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog04.class);
                startActivity(i);
            }
        });

        btn5 = (Button) findViewById(R.id.prg5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog05.class);
                startActivity(i);
            }
        });

        btn6 = (Button) findViewById(R.id.prg6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog06.class);
                startActivity(i);
            }
        });

        btn7 = (Button) findViewById(R.id.prg7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog07.class);
                startActivity(i);
            }
        });

        btn8 = (Button) findViewById(R.id.prg8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog08.class);
                startActivity(i);
            }
        });

        btn9 = (Button) findViewById(R.id.prg9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog09.class);
                startActivity(i);
            }
        });

        btn10 = (Button) findViewById(R.id.prg10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog10.class);
                startActivity(i);
            }
        });

        btn11 = (Button) findViewById(R.id.prg11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog11.class);
                startActivity(i);
            }
        });

        btn12 = (Button) findViewById(R.id.prg12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog12.class);
                startActivity(i);
            }
        });

        btn13 = (Button) findViewById(R.id.prg13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog13.class);
                startActivity(i);
            }
        });

        btn14 = (Button) findViewById(R.id.prg14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog14.class);
                startActivity(i);
            }
        });

        btn15 = (Button) findViewById(R.id.prg15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Assignment_1.this, prog15.class);
                startActivity(i);
            }
        });
    }
}