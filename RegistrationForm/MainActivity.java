package com.marwadi.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.net.Uri;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.security.PublicKey;

import kotlinx.coroutines.android.AndroidExceptionPreHandler;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2,txt3,txt4,txt5;
    AutoCompleteTextView simpleAutoCompleteTextView;
    Button btnclickme;
    Spinner spinnercountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        simpleAutoCompleteTextView = findViewById(R.id.simpleAutoCompleteTextView);
        spinnercountry = findViewById(R.id.spinnercountry);
        btnclickme=findViewById(R.id.btnclickme);


        String[] countrynamelist = {"India", "China", "Australia", "New Zealand"};
        AutoCompleteTextView simpleAutoCompleteTextView = findViewById(R.id.simpleAutoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, countrynamelist);
        simpleAutoCompleteTextView.setAdapter(adapter);
        simpleAutoCompleteTextView.setThreshold(1); // starts suggesting after 1 character

        spinnercountry = findViewById(R.id.spinnercountry);
        String[] countrynamelist1 = {"Select Country", "India", "China", "Australia", "New Zealand"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                countrynamelist
        );
        spinnercountry.setAdapter(spinnerAdapter);

        btnclickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1,str2,str3,str4,str5;
                str1=txt1.getText().toString().trim();
                str2=txt2.getText().toString().trim();
                str3=txt3.getText().toString().trim();
                str4=txt4.getText().toString().trim();
                str5=txt5.getText().toString().trim();
                String countrySpinner = spinnercountry.getSelectedItem().toString();
                String countryAuto = simpleAutoCompleteTextView.getText().toString();

                Intent in =new Intent(MainActivity.this,MainActivity2.class);
                in.putExtra("name",str1);
                in.putExtra("last",str2);
                in.putExtra("no",str3);
                in.putExtra("email",str4);
                in.putExtra("pwd",str5);
                in.putExtra("spinnerCountry", countrySpinner);
                in.putExtra("autoCountry", countryAuto);

                startActivity(in);

            }
        });


    }
}