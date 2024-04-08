package com.baldochi.lista4ex4;

public abstract class Produto {

    protected String descricao;
    protected double valor;
    protected double imposto;

    public Produto(String descricao, double valor, double imposto) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }

    public abstract double calcularPrecoFinal();

    public void relatorio() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + imposto);
        System.out.println("Preço Final: " + calcularPrecoFinal());
    }
}
