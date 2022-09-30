package com.example.jogo;

public class Resultados {

    private String Resultados;

    public Resultados(String resultados, String você_ganhou, String você_empatou) {
        Resultados = resultados;
    }

    public String getResultados() {
        return Resultados;
    }

    public void setResultados(String resultados) {
        Resultados = resultados;
    }
}
