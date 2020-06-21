package com.example.projetodmob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    // metodos que estabelece a conexao com o banco de dados, adiciona o contato e atualiza no banco

    public ContatoDAO (Context contexto){
        try {
            conexao = new Conexao(contexto);
            banco = conexao.getWritableDatabase();
        }

        catch (SQLException exe){
            Toast.makeText(contexto, "Erro" + exe.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public long addContato(Contato contato){

        ContentValues dados = new ContentValues();

        dados.put("nome", contato.getNome());
        dados.put("telefone", contato.getTelefone());

        return banco.insert("contato", null, dados);
    }

    public List<Contato> buscarContato(){
        String sql = "SELECT * FROM contato";

        Cursor c = banco.rawQuery(sql, null);

        List<Contato> contatos = new ArrayList<Contato>();

        while (c.moveToNext()){
            Contato contato = new Contato();
            contato.setNome(c.getString(c.getColumnIndex("nome")));
            contato.setTelefone(c.getString(c.getColumnIndex("telefone")));
            contatos.add(contato);
        }

        return contatos;
    }
}
