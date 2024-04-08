package com.baldochi.lista4ex4;

public class ProdutoNacional extends Produto {

    public ProdutoNacional(String descricao, double valor) {
        super(descricao, valor, 0.1); // Imposto de 10%
    }

    @Override
    public double calcularPrecoFinal() {
        return this.calcularPrecoFinal() + (valor * 0.05); // Taxa nacional de 5%
    }
}

