package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prog11 extends AppCompatActivity {
    private EditText nameEditText = (EditText) findViewById(R.id.savedname);
    private EditText addressEditText = (EditText) findViewById(R.id.savedaddress);
    private Button saveButton = (Button) findViewById(R.id.save);
    private Button loadButton = (Button) findViewById(R.id.load);

    private static final String PREFERENCE_NAME = "preference";
    private static final String NAME_KEY = "name";
    private static final String ADDRESS_KEY = "address";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog11);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadData();
            }
        });
    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME_KEY, nameEditText.getText().toString());
        editor.putString(ADDRESS_KEY, addressEditText.getText().toString());
        editor.apply();
    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        nameEditText.setText(sharedPreferences.getString(NAME_KEY, ""));
        addressEditText.setText(sharedPreferences.getString(ADDRESS_KEY, ""));
    }
}