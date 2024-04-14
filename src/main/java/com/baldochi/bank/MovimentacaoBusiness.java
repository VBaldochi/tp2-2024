package com.baldochi.bank;

public interface MovimentacaoBusiness {

    public void sacar(Conta conta, Double valor);

    public void depositar(Conta conta, Double valor);
}
