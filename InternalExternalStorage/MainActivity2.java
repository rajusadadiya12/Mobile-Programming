package com.marwadi.myapplayouts;

import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity2 extends AppCompatActivity {

    EditText etData;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etData = findViewById(R.id.etData);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(view -> {

            String data = etData.getText().toString();

            try {
                File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File file = new File(folder, "external.txt");

                FileOutputStream fos = new FileOutputStream(file);
                fos.write(data.getBytes());
                fos.close();

                Toast.makeText(this, "Saved to External Storage", Toast.LENGTH_SHORT).show();

            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this, "Error saving data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}