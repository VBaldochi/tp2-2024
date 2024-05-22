package com.baldochi.padroes.factory;

public class Pepperoni extends Pizza {

    public Pepperoni(ServicoEntrega servicoEntrega) {
        super.servicoEntrega = servicoEntrega;
    }

    @Override
    public void tipoPizza() {
        System.out.println("Pepperoni");
    }
}
