package com.baldochi.cafeteria;

public class Cafe extends Bebida {

    public Cafe(){
        super.descricao = "Café cremoso";
    }
    @Override
    public Double getValor() {
        return 3.0;
    }
}
