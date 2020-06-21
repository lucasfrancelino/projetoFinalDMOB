package com.example.projetodmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Agendatelefonica extends AppCompatActivity {

    EditText nome;
    EditText telefone;
    Button salvar;
    ListView lista;
    ContatoDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendatelefonica);

        // ndentificação dos botoes pelo IDs
        nome = findViewById(R.id.nome);
        telefone = findViewById(R.id.tell);
        salvar = findViewById(R.id.salvar);
        lista = findViewById(R.id.lista);
        dao = new ContatoDAO(this);

        // chama o metodo salvar, adiciona o contato e logo depois mostra os contatos salvos atualizandondo a tabela
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contato contato = new Contato();
                contato.setNome(nome.getText().toString());
                contato.setTelefone(telefone.getText().toString());
                LimparForm(nome, telefone);
                long id = dao.addContato(contato);
                Toast.makeText(Agendatelefonica.this, "id " + id, Toast.LENGTH_SHORT).show();
                List<Contato> contatos = dao.buscarContato();
                List<String> nomes = new ArrayList<String>();

                for (Contato nomeBuscado : contatos){
                    nomes.add(nomeBuscado.getNome());
                }

                ArrayAdapter<Contato> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, contatos);
                lista.setAdapter(adapter);

            }
        });
    }

    // limpa o formulario
    private void LimparForm(EditText nome, EditText telefone) {
        nome.setText("");
        nome.requestFocus();
        telefone.setText("");
    }
}
