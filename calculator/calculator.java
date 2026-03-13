package com.marwadi.myapplicationmca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculator extends AppCompatActivity {
    EditText etnum1,etnum2;
    TextView tvresult;
    Button btnadd,btnsub,btnmul,btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);
        tvresult=findViewById(R.id.tvresult);

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        btnadd.setOnClickListener(v -> calculator("+"));
        btnsub.setOnClickListener(v -> calculator("-"));
        btnmul.setOnClickListener(v -> calculator("*"));
        btndiv.setOnClickListener(v -> calculator("/"));
    }
    private void calculator(String operator){
        if(etnum1.getText().toString().isEmpty() || etnum2.getText().toString().isEmpty()){
            tvresult.setText("Enter both number");
            return;
        }
        double num1 = Double.parseDouble(etnum1.getText().toString());
        double num2 = Double.parseDouble(etnum2.getText().toString());
        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    tvresult.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                return;
        }

        tvresult.setText("Result: " + result);
    }
}