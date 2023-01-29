package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class prog15 extends AppCompatActivity {
    private EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
    private EditText ageEditText = (EditText) findViewById(R.id.ageEditText);
    private Button insertButton = (Button) findViewById(R.id.insertButton);
    private Button viewButton = (Button) findViewById(R.id.viewButton);

    private SQLiteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog15);

        database = openOrCreateDatabase("users", MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS users (name VARCHAR, age INT(3))");

        insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertData();
            }
        });

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewData();
            }
        });
    }

    private void insertData() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", nameEditText.getText().toString());
        contentValues.put("age", Integer.parseInt(ageEditText.getText().toString()));
        database.insert("users", null, contentValues);
        Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
    }

    private void viewData() {
        Cursor cursor = database.rawQuery("SELECT * FROM users", null);
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (cursor.moveToNext()) {
            stringBuilder.append("Name: " + cursor.getString(0) + "\n");
            stringBuilder.append("Age: " + cursor.getString(1) + "\n\n");
        }
        Toast.makeText(this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();

    }
}
