package com.baldochi.lista4ex4;

public class ProdutoEstadual extends Produto {

    public ProdutoEstadual(String descricao, double valor) {
        super(descricao, valor, 0.1); // Imposto de 10%
    }

    @Override
    public double calcularPrecoFinal() {
        return valor + (valor * imposto);
    }
}

