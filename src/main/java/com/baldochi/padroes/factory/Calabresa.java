package com.baldochi.padroes.factory;

public class Calabresa extends Pizza {

    public Calabresa(ServicoEntrega servicoEntrega) {
        super.servicoEntrega = servicoEntrega;
    }

    @Override
    public void tipoPizza() {
        System.out.println("Calabresa");
    }
}
