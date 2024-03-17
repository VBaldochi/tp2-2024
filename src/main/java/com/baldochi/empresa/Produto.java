package com.baldochi.empresa;

public class Produto {
    private int codigo;
    private String descricao;
    private double valorUnitario;

    public static Produto gerarDadosProduto() {
        // Implementar lógica para gerar dados aleatórios de um produto
        return new Produto(
                (int) (Math.random() * 1000),
                "Produto " + (int) (Math.random() * 100),
                Math.random() * 100
        );
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }

    public Produto(int codigo, String descricao, double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

   // @Override
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }


}