package com.example.rodrigobarreto1.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSAGEMTITULO";
    public static final String ITEM1 = "com.example.cardapio.MENSAGEMITEM1";
    public static final String ITEM2 = "com.example.cardapio.MENSAGEMITEM2";
    public String tituloDaActivity;
    public String textoItem1;
    public String textoItem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBerinjela(View view){
        tituloDaActivity = "Berinjela";
        textoItem1 = "Antepasto";
        textoItem2 = "Parmegiana";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, textoItem1);
        intent.putExtra(ITEM2, textoItem2);
        startActivity(intent);
    }

    public void abrirHamburguer(View view){
        tituloDaActivity = "Hamburguer";
        textoItem1 = "X-Salada";
        textoItem2 = "X-Bacon";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, textoItem1);
        intent.putExtra(ITEM2, textoItem2);
        startActivity(intent);
    }

    public void abrirDrink(View view){
        tituloDaActivity = "Drinks";
        textoItem1 = "Caipirinha";
        textoItem2 = "Suco de Laranja";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, textoItem1);
        intent.putExtra(ITEM2, textoItem2);
        startActivity(intent);
    }

    public void abrirDoces(View view){
        tituloDaActivity = "Doces";
        textoItem1 = "Pudim";
        textoItem2 = "Cocada";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, textoItem1);
        intent.putExtra(ITEM2, textoItem2);
        startActivity(intent);
    }
}
