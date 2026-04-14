package com.example.share_market;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    EditText etId, etFname, etLname, etMob, etAdd, etCity, etSpec;
    Button btnSubmit, btnSearchPage;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        db = new DBHelper(this);

        etId = findViewById(R.id.etId);
        etFname = findViewById(R.id.etFname);
        etLname = findViewById(R.id.etLname);
        etMob = findViewById(R.id.etMob);
        etAdd = findViewById(R.id.etAdd);
        etCity = findViewById(R.id.etCity);
        etSpec = findViewById(R.id.etSpec);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSearchPage = findViewById(R.id.btnSearchPage);

        btnSubmit.setOnClickListener(v -> {

            boolean inserted = db.insertData(
                    etId.getText().toString(),
                    etFname.getText().toString(),
                    etLname.getText().toString(),
                    etMob.getText().toString(),
                    etAdd.getText().toString(),
                    etCity.getText().toString(),
                    etSpec.getText().toString()
            );

            if (inserted)
                Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        });

        btnSearchPage.setOnClickListener(v ->
                startActivity(new Intent(this, SearchActivity.class)));
    }
}