package com.example.jogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String opcaSelecionada;
    private String opcaoSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada(opcaSelecionada "Pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada(opcaSelecionada "Papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada(opcaSelecionada "Tesoura");

    }

    public void opcaoSelecionada(String opcaSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado)

        int numero = new Random().nextInt(3);
        String[] opçoes = { "Pedra", "Papel", "Tesoura"};
        String opcaoApp = opçoes[numero];

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
    }

}