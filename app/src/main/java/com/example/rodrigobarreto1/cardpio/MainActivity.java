package com.example.rodrigobarreto1.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSAGEMTITULO";
    public String tituloDaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBerinjela(View view){
        tituloDaActivity = "Berinjela";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }

    public void abrirHamburguer(View view){
        tituloDaActivity = "Hamburguer";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }

    public void abrirDrink(View view){
        tituloDaActivity = "Drinks";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }

    public void abrirDoces(View view){
        tituloDaActivity = "Doces";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
}
