package com.example.projetodmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    //estanciando as variáveis
    private Button bSoma, bSub, bMult, bDiv, bPorc, bApagar;
    private EditText n1, n2;
    private TextView resultado;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //as variáveis recebem os IDs de cada função
        bSoma = findViewById(R.id.bSoma);
        bSub = findViewById(R.id.bSub);
        bMult = findViewById(R.id.bMult);
        bDiv = findViewById(R.id.bDiv);
        bPorc = findViewById(R.id.bPorc);
        bApagar = findViewById(R.id.bApagar);

        n1 = findViewById(R.id.editTextN1);
        n2 = findViewById(R.id.editTextN3);

        resultado = findViewById(R.id.textViewResultado);
    }

    public void Somar(View view){
        String a = n1.getText().toString().trim();
        String b = n2.getText().toString().trim();

        Double c = Double.parseDouble(a);
        Double d = Double.parseDouble(b);
        Double e = c + d;

        resultado.setText(e.toString());
    }

    public void Subtrair(View view){
        String a = n1.getText().toString().trim();
        String b = n2.getText().toString().trim();

        Double c = Double.parseDouble(a);
        Double d = Double.parseDouble(b);
        Double e = c - d;

        resultado.setText(e.toString());
    }

    public void Multiplicar(View view){
        String a = n1.getText().toString().trim();
        String b = n2.getText().toString().trim();

        Double c = Double.parseDouble(a);
        Double d = Double.parseDouble(b);
        Double e = c * d;

        resultado.setText(e.toString());
    }

    public void Dividir(View view){
        String a = n1.getText().toString().trim();
        String b = n2.getText().toString().trim();

        Double c = Double.parseDouble(a);
        Double d = Double.parseDouble(b);
        Double e = c / d;

        resultado.setText(e.toString());
    }

    public void Porcentagem(View view){
        String a = n1.getText().toString().trim();
        String b = n2.getText().toString().trim();

        Double c = Double.parseDouble(a);
        Double d = Double.parseDouble(b);
        Double e = (c * d) / 100;

        resultado.setText(e.toString());
    }

    public void Apagar(View view){
        n1.setText(" ");
        n2.setText(" ");

        n1.requestFocus();

        resultado.setText(" ");
    }

}
