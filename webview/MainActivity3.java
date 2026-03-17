package com.marwadi.myapplicationmca;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.marwadi.myapplicationmca.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    WebView webView;
    EditText urlEt;
    Button openBtn;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain3Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView = findViewById(R.id.webView);
        urlEt = findViewById(R.id.urlEt);
        openBtn = findViewById(R.id.openBtn);

        openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlOpen;
                urlOpen = "https://www." + urlEt.getText().toString();
                WebSettings wbs = webView.getSettings();
                wbs.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(urlOpen);
            }
        });


    }
}