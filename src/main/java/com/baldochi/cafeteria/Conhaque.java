package com.baldochi.cafeteria;

public class Conhaque extends Bebida {

    public Conhaque(){
        super.descricao = "Conhaque";
    }

    @Override
    public Double getValor() {
        return 15.0;
    }
}
