package com.baldochi.observer;

public class Sistema {

    public static void main(String[] args) {

        EmailService emailService = new EmailService();
        EstoqueService estoqueService = new EstoqueService();

        PedidoSubject pedidoSubject = new PedidoSubject();

        pedidoSubject.register(estoqueService);
        pedidoSubject.register(emailService);

        Pedido pedido = new Pedido("Pedro", 1, 100.0);

        pedidoSubject.criarPedido(pedido);
    }
}
