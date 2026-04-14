package com.example.myappsharedpref;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    EditText editText;
    Button btnSave, btnLoad;
    TextView textView;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        editText  = findViewById(R.id.editTextName);
        btnSave   = findViewById(R.id.btnSave);
        btnLoad   = findViewById(R.id.btnLoad);
        textView  = findViewById(R.id.textViewResult);

        dbHelper = new DBHelper(this);

        // Save to SQLite
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                dbHelper.insertData(name);
                textView.setText("Saved to DB!");
            }
        });

        // Load from SQLite
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dbHelper.getData();
                textView.setText(data);
            }
        });
    }
}