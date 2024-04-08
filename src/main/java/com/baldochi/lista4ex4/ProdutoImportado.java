package com.baldochi.lista4ex4;

public class ProdutoImportado extends ProdutoNacional {

    protected double taxaImportacao;

    public ProdutoImportado(String descricao, double valor, double taxaImportacao) {
        super(descricao, valor);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + (valor * taxaImportacao);
    }
}

