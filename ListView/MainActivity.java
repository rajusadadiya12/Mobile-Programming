package com.example.myapplicationform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etName, etEmail, etPassword;
    RadioGroup radioGroupGender;
    Spinner spinnerCountry;
    CheckBox checkTerms;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        spinnerCountry = findViewById(R.id.spinnerCountry);
        checkTerms = findViewById(R.id.checkTerms);
        btnRegister = findViewById(R.id.btnRegister);
        String[] countries = {"Select Country", "India", "USA", "UK", "Canada"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countries);
        spinnerCountry.setAdapter(adapter);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkTerms.isChecked()) {
                    Toast.makeText(MainActivity.this, "Please accept Terms & Conditions", Toast.LENGTH_SHORT).show();
                } else {
                    String name = etName.getText().toString();
                    String email = etEmail.getText().toString();
                    String country = spinnerCountry.getSelectedItem().toString();
                    int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
                    String gender = (selectedGenderId == R.id.radioMale) ? "Male" : "Female";

                    // Intent to ListView Activity
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);

                    // Pass data using putExtra
                    i.putExtra("name", name);
                    i.putExtra("email", email);
                    i.putExtra("gender", gender);
                    i.putExtra("country", country);

                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}