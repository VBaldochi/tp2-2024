package com.baldochi.cafeteria;

import java.util.List;

public class Calecon extends BlendDecorator{

    private List<Bebida> listabebidas;

    public Calecon(List<Bebida> bebidas){

        this.listabebidas = bebidas;

        super.descricao = "Calecon (Café, leite e conhaque)";

    }

    @Override
    public Double getValor() {
        Double total = 0.0;

        for (Bebida b : this.listabebidas) {
            total += b.getValor();
        }
        total += 3.0;
        return total;
    }
}
