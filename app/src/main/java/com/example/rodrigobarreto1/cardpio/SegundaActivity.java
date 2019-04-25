package com.example.rodrigobarreto1.cardpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rodrigobarreto1.cardpio.modelos.Produto;

import java.util.ArrayList;

public class SegundaActivity extends AppCompatActivity {

    public ArrayList<Produto> produtos = new ArrayList<>();
    public LinearLayout layoutLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        TextView textViewTitulo = findViewById(R.id.tvTitulo);
        textViewTitulo.setText(titulo);


        if (titulo.equals("Berinjela")){
            produtos.add(new Produto("Antepasto", 12.99,  "Berinjela", "Berinjela, pimentão, azeitona e cebola"));
            produtos.add(new Produto("Parmegiana", 17.99,  "Berinjela", "Berinjela, pimentão, azeitona e cebola"));
            produtos.add(new Produto("Recheada", 14.99,  "Berinjela", "Berinjela, pimentão, azeitona e cebola"));
        }

        else if (titulo.equals("Hamburguer")){
            produtos.add(new Produto("X-Salada", 14.99,  "Hamburguer", "Queijo, hamburguer, alface e tomate"));
            produtos.add(new Produto("X-Egg", 12.99,  "Hamburguer", "Queijo, hambuguer e ovo"));
        }

        else if (titulo.equals("Drinks")){
            produtos.add(new Produto("Caipirinha", 9.99,  "Drinks", "Suco de limão e açucar"));
        }

        else if (titulo.equals("Doces")){
            produtos.add(new Produto("Pudim", 99.99,  "Doces", "Uma delícia"));
        }

        listaProdutos(produtos);

    }//Método onCreate

    public void listaProdutos(ArrayList<Produto> lista){

        layoutLinear = findViewById(R.id.lVertical);
        for (int i=0; i<lista.size(); i++) {
            TextView textViewItem1 = new TextView(this);
            TextView textViewDesc1 = new TextView(this);
            TextView textViewPreco1 = new TextView(this);

            textViewItem1.setText(lista.get(i).getNome());
            textViewItem1.setTextSize(18);
            textViewDesc1.setText(lista.get(i).getDescricao());
            textViewPreco1.setText("R$ " + lista.get(i).getPreco().toString());

            layoutLinear.addView(textViewItem1);
            layoutLinear.addView(textViewDesc1);
            layoutLinear.addView(textViewPreco1);
        }

    }//Método listaProdutos

}//Final da Classe
