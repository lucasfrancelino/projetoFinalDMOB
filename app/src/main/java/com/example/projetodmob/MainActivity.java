package com.example.projetodmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button calcula;
    Button navega;
    Button agenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcula = findViewById(R.id.calcula);
        navega = findViewById(R.id.navega);
        agenda = findViewById(R.id.agenda);

        // cada metodo abre uma funcionalidade do app
        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Calculadora.class);
                startActivity(it);
            }
        });

        navega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Navegador.class);
                startActivity(it);
            }
        });

        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(MainActivity.this,Agendatelefonica.class);
                startActivity(it2);
            }
        });

    }
}
