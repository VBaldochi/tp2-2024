package com.baldochi.cafeteria;

public class Pingado extends Bebida {

    public Pingado(){
        super.descricao = "Pingado";
    }

    @Override
    public Double getValor() {
        return 6.0;
    }
}
