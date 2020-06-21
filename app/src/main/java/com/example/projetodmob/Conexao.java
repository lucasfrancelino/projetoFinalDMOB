package com.example.projetodmob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    // metodos que cria e executa a tabela e atualiza quando um novo contato é adicionado

    public Conexao(Context context){
        super(context, "Banco", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE contato(nome varchar(50), telefone varchar(11))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS contato";
        db.execSQL(sql);
        onCreate(db);
    }
}
