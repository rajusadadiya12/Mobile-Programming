package com.example.share_market;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    EditText etSearchId;
    Button btnSearch;
    TextView tvResult;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        db = new DBHelper(this);

        etSearchId = findViewById(R.id.etSearchId);
        btnSearch = findViewById(R.id.btnSearch);
        tvResult = findViewById(R.id.tvResult);

        btnSearch.setOnClickListener(v -> {

            Cursor cursor = db.getData(etSearchId.getText().toString());

            if (cursor.getCount() == 0) {
                tvResult.setText("No Data Found");
                return;
            }

            cursor.moveToFirst();

            String data =
                    "ID: " + cursor.getString(0) + "\n" +
                            "Name: " + cursor.getString(1) + " " + cursor.getString(2) + "\n" +
                            "Mobile: " + cursor.getString(3) + "\n" +
                            "Address: " + cursor.getString(4) + "\n" +
                            "City: " + cursor.getString(5) + "\n" +
                            "Specialization: " + cursor.getString(6);

            tvResult.setText(data);
        });
    }
}