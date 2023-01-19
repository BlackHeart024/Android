package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class prog13 extends AppCompatActivity {
    private EditText ed1, ed2, ed3;
    Button btnsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog13);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        ed1 = (EditText) findViewById(R.id.amount);
        ed2 = (EditText) findViewById(R.id.roi);
        ed3 = (EditText) findViewById(R.id.tp);

        btnsi = (Button) findViewById(R.id.bsi);
        btnsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                String value3 = ed3.getText().toString();
                float p = Float.parseFloat(value1);
                float r = Float.parseFloat(value2);
                float n = Float.parseFloat(value3);
                float si=(p*r*n)/100;
                Toast.makeText(prog13.this, String.valueOf(si), Toast.LENGTH_SHORT).show();
            }
        });
    }
}