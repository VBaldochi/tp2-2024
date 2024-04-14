package com.baldochi.interfaces;

public class VendaFutura implements Venda, SeguroInterface {
    @Override
    public Double calcularSeguro() {
        return 100.0;
    }

    @Override
    public void vender(String cliente, Double total) {

    }

    @Override
    public Double calcularComissao(Double valorVenda) {
        return valorVenda * 0.1;
    }
}
