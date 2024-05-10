package com.baldochi.cafeteria;

public class ConCafe extends BlendDecorator {

    private Bebida bebida;

    public ConCafe(Bebida bebida) {
        this.bebida = bebida;
        super.descricao = "ConCafe (café + conhaque)";
    }

    @Override
    public Double getValor() {
        return bebida.getValor() + 5.0;
    }
}
