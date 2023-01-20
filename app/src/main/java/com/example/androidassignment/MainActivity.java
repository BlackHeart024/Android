package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] choice = {"Select your Choice","Assignment-I", "Assignment-II"};
    int curitem = 0;
    int curitem2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, choice);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0,View arg1, int position, long id) {
        if(curitem==position) {
            return;
        }
        else if(curitem2==position) {
            Intent i = new Intent(MainActivity.this, Assignment_1.class);
            startActivity(i);
        }
        else{
                Intent j = new Intent(MainActivity.this, Assignment_2.class);
                startActivity(j);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}