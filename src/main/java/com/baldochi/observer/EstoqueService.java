package com.baldochi.observer;

public class EstoqueService implements PedidoObserver{

    @Override
    public void processarPedido(Pedido pedido) {
        this.baixarEstoque(pedido);
    }

    public void baixarEstoque(Pedido p) {
        System.out.println("baixa estoque do pedido: " + p);
    }
}
