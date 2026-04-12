package com.example.myappsimplelogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    String correctUsername = "admin";
    String correctPassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUsername.getText().toString();
                String pass = etPassword.getText().toString();
                if(user.equals(correctUsername) && pass.equals(correctPassword)) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("username", user);
                    intent.putExtra("password", pass);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,
                            "Invalid Username or Password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}