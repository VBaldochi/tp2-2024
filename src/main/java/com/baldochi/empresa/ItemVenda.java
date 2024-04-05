package com.baldochi.empresa;

public class ItemVenda {
    private int codigo;
    private int quantidade;
   // private double totalItem;
    private Produto produto;



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

    public void setCodigo(int i) {
        this.codigo = i;
    }

    public void setQuantidadeVendida(int i) {
        this.quantidade = i;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


//    private double calcularTotalItem() {
//        return quantidade * produto.getValorUnitario();
//    }
}
