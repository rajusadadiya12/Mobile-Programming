package com.example.myapplicationmca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    RatingBar ratingBar;
    Button btnSubmit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);
        btnSubmit.setOnClickListener(v -> {
            float rating = ratingBar.getRating();
            txtResult.setText("You Rated: " + rating + " Stars");
            Toast.makeText(this, "Rating Submitted: " + rating, Toast.LENGTH_SHORT).show();
        });
    }
}
