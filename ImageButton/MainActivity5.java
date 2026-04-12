package com.example.myappsimplelogin;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    ImageButton imageButton;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imageButton = findViewById(R.id.imageButton);
        tvMessage = findViewById(R.id.tvMessage);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText("ImageButton Clicked!");
                Toast.makeText(MainActivity5.this, "You clicked the ImageButton", Toast.LENGTH_SHORT).show();
            }
        });
    }
}