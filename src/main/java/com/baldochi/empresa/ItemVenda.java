package com.baldochi.empresa;

public class ItemVenda {
    private int codigo;
    private int quantidade;
   // private double totalItem;
    private Produto produto;

    public ItemVenda(int codigo, int quantidade, Produto produto) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.produto = produto;
       // this.totalItem = calcularTotalItem();
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        //this.totalItem = calcularTotalItem();
    }

//    public double getTotalItem() {
//        return totalItem;
//    }

    public Produto getProduto() {
        return produto;
    }

//    private double calcularTotalItem() {
//        return quantidade * produto.getValorUnitario();
//    }
}
