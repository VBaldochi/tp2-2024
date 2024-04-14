package com.baldochi.interfaces;

public class VendaMercadoria implements Venda {


    @Override
    public void vender(String cliente, Double total) {

        // Codar funcionalidade

    }

    @Override
    public Double calcularComissao(Double valorVenda) {

        return valorVenda * 0.4;
    }
}
