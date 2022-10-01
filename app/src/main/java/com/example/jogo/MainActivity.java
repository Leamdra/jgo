package com.example.jogo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Resultados> listaResultados = new ArrayList<>();

    private String opcaSelecionada;
    private String opcaoSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada(opcaSelecionada, "pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada(opcaSelecionada "Papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada(opcaSelecionada,"Tesoura");

    }

    public void opcaoSelecionada(String opcaSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = { "pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){

            case "Pedra" :
                imageResultado.setImageResource(R.drawable.pedra);
                break;

            case "Papel" :
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "Tesoura" :
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }


        if( (opcaoApp == "Tesoura" && opcaoSelecionada == "Papel") ||
                (opcaoApp == "Papel" && opcaoSelecionada == "Pedra")   ||
                (opcaoApp == "Pedra" && opcaoSelecionada == "Tesoura")


        ){
            textResultado.setText("Você perdeu");

        }
        else if(
                (opcaoApp == "Tesoura" && opcaoSelecionada == "Papel") ||
                        (opcaoApp == "Papel" && opcaoSelecionada == "Pedra")   ||
                        (opcaoApp == "Pedra" && opcaoSelecionada == "Tesoura")
        )
        {
            textResultado.setText("Você ganhou");

        }
        else
        {
            textResultado.setText("Você empatou");
        }


        recyclerView = findViewById(R.id.recycleView);

        //criar  resultados
        this.criarResultados();


        //config adapter
        adapter adapter = new adapter();




        //layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        //adapter

        //dataset
    }

    public void criarResultados(){

        String textResultado;
        Resultados resultado = new Resultados(textResultado);
        listaResultados.add(resultado);
    }

}