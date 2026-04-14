package com.marwadi.myapplayouts;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.FileOutputStream;

public class MainActivity1 extends AppCompatActivity {

    EditText etData;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        etData = findViewById(R.id.etData);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(view -> {
            String data = etData.getText().toString();

            try {
                FileOutputStream fos = openFileOutput("internal.txt", MODE_PRIVATE);
                fos.write(data.getBytes());
                fos.close();

                Toast.makeText(this, "Saved to Internal Storage", Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this, "Error saving data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}