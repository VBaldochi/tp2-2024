package com.baldochi.observer;

import java.util.List;
import java.util.ArrayList;

public class PedidoSubject implements Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    private Pedido novoPedido;

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observerList) {
            if (o instanceof PedidoObserver) {
                PedidoObserver pedidoObserver = (PedidoObserver) o;
                pedidoObserver.processarPedido(novoPedido);
            }
        }
    }

    public void criarPedido(Pedido p){
        this.novoPedido = p;
        this.notifyObservers();
    }
}
