package com.example.myappsimplelogin;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvResult = findViewById(R.id.tvResult);
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");
        tvResult.setText("Username: " + username + "\nPassword: " + password);
    }
}