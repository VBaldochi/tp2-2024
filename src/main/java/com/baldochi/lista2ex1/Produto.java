package com.baldochi.lista2ex1;

public class Produto {

    private int codigo;
    private int quantidade;
    private double valorCompra;
    private double valorVenda;

    public Produto(int codigo, int quantidade, double valorCompra, double valorVenda) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor de compra: R$" + valorCompra);
        System.out.println("Valor de venda: R$" + valorVenda);
        System.out.println();
    }
}
