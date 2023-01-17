package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class prog3 extends AppCompatActivity {
    private EditText ed1,ed2;
    private Button btnsum,btnsub,btnmul,btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog3);

        addListenerOnButton();
    }
    public void addListenerOnButton() {
        ed1 = (EditText) findViewById(R.id.ednum1);
        ed2 = (EditText) findViewById(R.id.ednum2);
        btnsum = (Button) findViewById(R.id.sum);
        btnsub = (Button) findViewById(R.id.sub);
        btnmul = (Button) findViewById(R.id.mul);
        btndiv = (Button) findViewById(R.id.div);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a+b;
                Toast.makeText(prog3.this,String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sub = a-b;
                Toast.makeText(prog3.this,String.valueOf(sub), Toast.LENGTH_SHORT).show();
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int mul = a*b;
                Toast.makeText(prog3.this,String.valueOf(mul), Toast.LENGTH_SHORT).show();
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int div = a/b;
                Toast.makeText(prog3.this,String.valueOf(div), Toast.LENGTH_SHORT).show();
            }
        });
    }
}