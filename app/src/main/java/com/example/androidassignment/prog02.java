package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class prog02 extends AppCompatActivity {
    EditText ed1,ed2;
    Button btnmerge;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog02);

        addListenerOnButton();
    }
    public void addListenerOnButton() {
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        btnmerge = (Button) findViewById(R.id.merge);
        result = (TextView) findViewById(R.id.result);

        btnmerge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = ed1.getText().toString();
                String value2 = ed2.getText().toString();
                String concate=(value1+value2);
                result.setText(concate);
            }
        });
    }
}