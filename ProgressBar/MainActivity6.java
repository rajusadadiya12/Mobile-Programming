package com.example.myapplicationmca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {
    ProgressBar progressBar;
    Button btnStart;
    TextView txtStatus;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        progressBar = findViewById(R.id.progressBar);
        btnStart = findViewById(R.id.btnStart);
        txtStatus = findViewById(R.id.txtStatus);
        btnStart.setOnClickListener(v -> startProgress());
    }
    private void startProgress() {
        progress = 0;
        new Thread(() -> {
            while (progress <= 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress++;
                runOnUiThread(() -> {
                    progressBar.setProgress(progress);
                    txtStatus.setText("Progress: " + progress + "%");
                });
            }
        }).start();
    }
}