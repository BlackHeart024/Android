package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class prog17 extends AppCompatActivity {
    CheckBox pizza, coffee, burger;
    Button buttonOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog17);
        addListernOnButtonClick();
    }
    public void addListernOnButtonClick() {
        pizza = (CheckBox) findViewById(R.id.checkBox);
        coffee = (CheckBox) findViewById(R.id.checkBox2);
        burger = (CheckBox) findViewById(R.id.checkBox3);
        buttonOrder = (Button) findViewById(R.id.button3);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items: ");
                if(pizza.isChecked()) {
                    result.append("\nPizza 100/-");
                    totalamount+=100;
                }
                if (coffee.isChecked()) {
                    result.append("\n Coffee 50/-");
                    totalamount+=50;
                }
                if (burger.isChecked()) {
                    result.append("\n Burger 120/-");
                    totalamount+=120;
                }
                result.append("\nTotal: "+totalamount+"Rs.");
                Toast.makeText(prog17.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}