package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prog09 extends AppCompatActivity {
    private EditText editText;
    private Button boldButton;
    private Button italicButton;
    private Button normalButton;
    private Button fontButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog09);

        editText = (EditText) findViewById(R.id.editText);
        boldButton = (Button) findViewById(R.id.button_bold);
        italicButton = (Button) findViewById(R.id.button_italic);
        normalButton = (Button) findViewById(R.id.button_normal);
        fontButton = (Button) findViewById(R.id.button_font_1);

        boldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setTypeface(null, Typeface.BOLD);
            }
        });

        italicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setTypeface(null, Typeface.ITALIC);
            }
        });

        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setTypeface(null, Typeface.NORMAL);
            }
        });

//        fontButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
//                editText.setTypeface(customFont);
//            }
//        });
    }
}