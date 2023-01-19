package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prog06 extends AppCompatActivity {
    EditText name, email, passw;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog06);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        name = (EditText) findViewById(R.id.edname);
        email = (EditText) findViewById(R.id.edemail);
        passw = (EditText) findViewById(R.id.edpass);
        sub = (Button) findViewById(R.id.submit);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sname = name.getText().toString();
                String semail = email.getText().toString();
                String spass = passw.getText().toString();
                Intent i = new Intent(prog06.this, prog06_2.class);
                i.putExtra("sname", sname);
                i.putExtra("semail", semail);
                i.putExtra("spass", spass);
                startActivity(i);
            }
        });
    }
}