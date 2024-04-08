package com.baldochi.lista4ex5;

import java.util.Date;

public class Jogador {

    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoesAmarelos;
    private boolean suspenso;


    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = 0;
        this.suspenso = false;
    }

    public void aplicarCartao(int quantidade) {
        this.cartoesAmarelos += quantidade;
        if (this.cartoesAmarelos >= 3) {
            this.suspenso = true;
        }
    }

    public void cumprirSuspencao() {
        this.cartoesAmarelos = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        int reducaoQualidade = (int) (Math.random() * (qualidade * 0.15));
        qualidade -= reducaoQualidade;
        if (qualidade < 0) {
            qualidade = 0;
        }
    }

    public boolean estaAptoAJogar() {
        return !suspenso;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    @Override
    public String toString() {
        return String.format("%d - %s (%s) - %s - %d - %s - %d - %s - %s", id, nome, apelido, posicao, numero,
                dataNascimento, qualidade, cartoesAmarelos, suspenso ? "Suspenso" : "Apto a jogar");
    }
}

