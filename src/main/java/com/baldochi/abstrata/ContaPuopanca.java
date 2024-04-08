package com.baldochi.abstrata;

public class ContaPuopanca extends Conta {

    @Override
    public Double sacar(Double valor) {
        if (valor <= super.saldo) {
            this.saldo -= valor;
            return valor;
        }
        return null;
    }

    @Override
    public Double calcularTarifa() {
        return 0.0;
    }
}
