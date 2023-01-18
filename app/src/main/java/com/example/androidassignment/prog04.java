package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class prog04 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] concur = {"Rupee","Dollar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog04);

        Spinner spin1 = (Spinner) findViewById(R.id.convert);
        spin1.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,concur);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?>arg0, View arg1, int position, long id) {
        Toast.makeText(prog04.this,concur[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?>arg0) {
    }
}