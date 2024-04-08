package com.baldochi.abstrata;

public abstract class Conta {



    protected Integer numero;

    protected String cliente;

    protected Double saldo;

    public abstract Double sacar(Double valor);

    public abstract Double calcularTarifa();
    public void depositar(Double valor) {
        if (saldo == null) {
            this.saldo = valor;
        } else {
            this.saldo += valor;
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
