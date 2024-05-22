package com.baldochi.padroes.factory;

public class Mucarela extends Pizza {

    public Mucarela(ServicoEntrega servicoEntrega) {
        super.servicoEntrega = servicoEntrega;
    }

    @Override
    public void tipoPizza() {
        System.out.println("Mucarela");
    }
}
