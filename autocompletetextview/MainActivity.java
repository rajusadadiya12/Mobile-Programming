package com.example.myappautoco;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] cNl = {"India", "China", "Australia", "New Zealand", "United Kingdom"};
        AutoCompleteTextView smTxt = findViewById(R.id.simpleActv);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,cNl);
        smTxt.setAdapter(ad);
    }
}