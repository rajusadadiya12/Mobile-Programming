package com.marwadi.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView textview1,textview2,textview3,textview4,textview5,textviewCountrySpinner,textviewCountryAuto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textview1 = findViewById(R.id.textview1);
        TextView textview2 = findViewById(R.id.textview2);
        TextView textview3 = findViewById(R.id.textview3);
        TextView textview4 = findViewById(R.id.textview4);
        TextView textview5 = findViewById(R.id.textview5);
        textviewCountrySpinner = findViewById(R.id.textviewCountrySpinner);
        textviewCountryAuto = findViewById(R.id.textviewCountryAuto);


        Intent intent = getIntent();
        String str1,str2,str3,str4,str5;
        str1=getIntent().getStringExtra("name");
        str2=getIntent().getStringExtra("last");
        str3=getIntent().getStringExtra("no");
        str4=getIntent().getStringExtra("email");
        str5=getIntent().getStringExtra("pwd");


        String spinnerCountry = intent.getStringExtra("spinnerCountry");
        String autoCountry = intent.getStringExtra("autoCountry");
        textview1.setText(str1);
        textview2.setText(str2);
        textview3.setText(str3);
        textview4.setText(str4);
        textview5.setText(str5);
        textviewCountrySpinner.setText(spinnerCountry);
        textviewCountryAuto.setText(autoCountry);
    }
}