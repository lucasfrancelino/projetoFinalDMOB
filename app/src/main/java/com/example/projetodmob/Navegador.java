package com.example.projetodmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Navegador extends AppCompatActivity {

    private Button btnURL;
    private EditText textURL;
    private WebView browserWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        //identificando os botoes com seus ID's'
        btnURL = (Button)findViewById(R.id.btnGO);
        textURL = (EditText) findViewById(R.id.urlText);
        browserWeb = (WebView)findViewById(R.id.viewBrowser);

        //habilitando sites em JS.
        browserWeb.getSettings().setJavaScriptEnabled(true);
        //definindo nosso app como navegador
        browserWeb.setWebViewClient(new WebViewClient());

        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                browserWeb.loadUrl(textURL.getText().toString());
            }
        });
    }
}
