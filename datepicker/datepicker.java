package com.marwadi.myapplicationmca;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class datepicker extends AppCompatActivity {
    DatePicker datePicker;
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datepicker);
        datePicker=findViewById(R.id.dt);
        btn=findViewById(R.id.btnshowdate);
        txt=findViewById(R.id.showdate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int day=datePicker.getDayOfMonth();
                int month=datePicker.getMonth() + 1;
                int year=datePicker.getYear();

                String selectDate = day + "/" + month + "/" + year;

                btn.setText("select date" + selectDate);

                Toast.makeText(datepicker.this,
                        "Date"+selectDate,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}