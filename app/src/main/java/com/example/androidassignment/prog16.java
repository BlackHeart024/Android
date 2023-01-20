package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class prog16 extends AppCompatActivity {
    private ToggleButton tbut1,tbut2;
    private Button butsum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog16);

        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick() {
        tbut1 = (ToggleButton) findViewById(R.id.tb1);
        tbut2 = (ToggleButton) findViewById(R.id.tb2);
        butsum = (Button) findViewById(R.id.btnsub);

        butsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1: ").append(tbut1.getText());
                result.append("\nToggleButton2: ").append(tbut2.getText());
                Toast.makeText(prog16.this,result.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}