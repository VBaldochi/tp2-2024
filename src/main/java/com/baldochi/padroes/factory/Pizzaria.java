package com.baldochi.padroes.factory;

public class Pizzaria {

    public static void main(String[] args) {

        Pizza p1 = PizzaFactory.create(PizzaEnum.CALABRESA);
        p1.tipoPizza();
        if (p1.getServicoEntrega() == null) {
            System.out.println("SEM ENTREGA");
        } else {
            System.out.println(p1.getServicoEntrega().getTipoEntrega());
        }

        Pizza p2 = PizzaFactory.create(PizzaEnum.MUCARELA);
        p2.tipoPizza();
        if (p2.getServicoEntrega() == null) {
            System.out.println("SEM ENTREGA");
        } else {
            System.out.println(p2.getServicoEntrega().getTipoEntrega());
        }

        Pizza p3 = PizzaFactory.create(PizzaEnum.PEPERONI);
        p3.tipoPizza();
        if (p3.getServicoEntrega() == null) {
            System.out.println("SEM ENTREGA");
        } else {
            System.out.println(p3.getServicoEntrega().getTipoEntrega());
        }
    }
}
