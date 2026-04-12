package com.example.myapplicationmca;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    MultiAutoCompleteTextView multiAuto;
    Button btnShow;
    TextView txtResult;
    String[] skills = {"Java", "Python", "C++", "Android", "Kotlin", "Flutter", "React", "HTML", "CSS", "JavaScript", "SQL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        multiAuto = findViewById(R.id.multiAuto);
        btnShow = findViewById(R.id.btnShow);
        txtResult = findViewById(R.id.txtResult);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, skills);
        multiAuto.setAdapter(adapter);
        multiAuto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        btnShow.setOnClickListener(v -> txtResult.setText("Skills: " + multiAuto.getText().toString()));
    }
}