package com.baldochi.interfaces;

public class VendaServico implements Venda, SeguroInterface {
    @Override
    public Double calcularSeguro() {
        return 90.0;
    }

    @Override
    public void vender(String cliente, Double total) {

        // Codar funcionalidade
    }

    @Override
    public Double calcularComissao(Double valorVenda) {

        return valorVenda * 0.2;
    }

}
