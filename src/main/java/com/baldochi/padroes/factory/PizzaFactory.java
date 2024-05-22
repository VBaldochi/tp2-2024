package com.baldochi.padroes.factory;

public abstract class PizzaFactory {

    public static Pizza create(PizzaEnum pizzaEnum) {

        Pizza p = null;

        if(pizzaEnum.equals(PizzaEnum.CALABRESA)){
            p = new Calabresa(new ServicoEntrega("Motoboy"));
        }else if(pizzaEnum.equals(PizzaEnum.MUCARELA)){
            p = new Mucarela(new ServicoEntrega("Expresso"));
        }else if(pizzaEnum.equals(PizzaEnum.PEPERONI)){
            p = new Pepperoni(null);
        }

        return p;
    }
}
