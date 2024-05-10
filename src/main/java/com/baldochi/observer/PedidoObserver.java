package com.baldochi.observer;

public interface PedidoObserver extends Observer {

    public void processarPedido(Pedido pedido);
}
