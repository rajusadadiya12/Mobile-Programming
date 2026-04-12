package com.example.myapplicationmca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnChange;
    int currentImage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener(v -> {
            if(currentImage == 1){
                imageView.setImageResource(R.drawable.img2);
                currentImage = 2;
            }
            else if(currentImage == 2){
                imageView.setImageResource(R.drawable.img3);
                currentImage = 3;
            }
            else{
                imageView.setImageResource(R.drawable.img1);
                currentImage = 1;
            }
        });
    }
}