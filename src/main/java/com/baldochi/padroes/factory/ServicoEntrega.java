package com.baldochi.padroes.factory;

public class ServicoEntrega {

    private String tipoEntrega;

    public ServicoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }
}
