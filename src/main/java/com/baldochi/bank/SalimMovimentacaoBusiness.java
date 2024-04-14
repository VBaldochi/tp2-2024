package com.baldochi.bank;

public class SalimMovimentacaoBusiness extends MovimentacaoPadrao implements MovimentacaoBusiness {

    @Override
    public void sacar(Conta conta, Double valor) {

        if (conta.getSaldo() >= valor) {
            conta.alterarSaldo(-valor);
        } else {
            System.err.println("Saldo insuficiente para saque. Saldo atual: " + conta.getSaldo());
        }
    }

    @Override
    public void depositar(Conta conta, Double valor) {

    }
}
