package com.example.mytoasimpl;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String fname = getIntent().getStringExtra("fname");
        String lname = getIntent().getStringExtra("lname");
        String mobile = getIntent().getStringExtra("mobile");
        String email = getIntent().getStringExtra("email");

        String message = "Name: " + fname + " " + lname + "\nMobile: " + mobile + "\nEmail: " + email;

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}