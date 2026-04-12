package com.example.mytoasimpl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ftName,ltName,mobileNo,eName,passWor;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ftName=findViewById(R.id.ftName);
        ltName=findViewById(R.id.ltName);
        mobileNo=findViewById(R.id.mobileNo);
        eName=findViewById(R.id.eName);
        passWor=findViewById(R.id.passWor);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = ftName.getText().toString().trim();
                String lname = ltName.getText().toString().trim();
                String mobile = mobileNo.getText().toString().trim();
                String email = eName.getText().toString().trim();
                String pass = passWor.getText().toString().trim();

                if (fname.isEmpty() || lname.isEmpty() || mobile.isEmpty() || email.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("fname", fname);
                    i.putExtra("lname", lname);
                    i.putExtra("mobile", mobile);
                    i.putExtra("email", email);
                    startActivity(i);
                }
            }
        });
    }
}