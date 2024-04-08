package com.baldochi.abstrata;

public class ContaCorrente extends Conta {

    protected Double limite = 100D;
    @Override
    public Double sacar(Double valor) {
        if (valor <= (super.saldo + this.limite)) {
            super.saldo -= valor;
            return valor;
        }
        return null;
    }

    @Override
    public Double calcularTarifa() {
        return super.saldo * 0.225;
    }
}
