package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class prog08 extends AppCompatActivity {
    private ListView listView;
    private Button addButton = (Button) findViewById(R.id.additem);
    private Button deleteButton = (Button) findViewById(R.id.delitem);
    private Button searchButton = (Button) findViewById(R.id.searchitem);
    private EditText inputEditText = (EditText) findViewById(R.id.item);
    private List<String> itemList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog08);
        listView = (ListView) findViewById(R.id.listar);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEditText.getText().toString();
                itemList.add(input);
                adapter.notifyDataSetChanged();
                inputEditText.setText("");
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEditText.getText().toString();
                if (itemList.contains(input)) {
                    itemList.remove(input);
                    adapter.notifyDataSetChanged();
                }
                inputEditText.setText("");
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEditText.getText().toString();
                if (itemList.contains(input)) {
                    int position = itemList.indexOf(input);
                    listView.setSelection(position);
                }
                inputEditText.setText("");
            }
        });
    }
}