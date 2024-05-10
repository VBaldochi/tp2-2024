package com.baldochi.cafeteria;

public class Leite extends Bebida {
    public Leite(){
        super.descricao = "Leite da fazenda";
    }
    @Override
    public Double getValor() {
        return 4.0;
    }
}
