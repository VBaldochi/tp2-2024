package com.baldochi.interfaces;

public class Teste {

    public static void main(String[] args) {

        String tipoPedido = "mercadoria";

        Venda venda;

        if ("mercadoria".equals(tipoPedido)) {

            venda = new VendaMercadoria();

        } else if ("futura".equals(tipoPedido)) {
            venda = new VendaFutura();

        } else {
            venda = new VendaServico();
        }

        venda.vender("Pedro", 100.0);
        venda.calcularComissao(100.0);
    }
}
