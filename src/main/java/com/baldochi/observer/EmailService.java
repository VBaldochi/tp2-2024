package com.baldochi.observer;

import java.sql.SQLOutput;

public class EmailService implements PedidoObserver{

    @Override
    public void processarPedido(Pedido pedido) {
        this.enviarEmail(pedido);
    }

    public void enviarEmail(Pedido pedido) {
        System.out.println("Email enviado");
    }
}
