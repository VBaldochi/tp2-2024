package com.baldochi.bank;

public class FeliMovimentacaoBusiness extends MovimentacaoPadrao implements MovimentacaoBusiness {

    private static final Double LIMITE = 2000.0;
    @Override
    public void sacar(Conta conta, Double valor) {

        if (conta.getSaldo() + LIMITE >= valor) {
            conta.alterarSaldo(-valor);
        } else {
            System.err.println("Saldo + limite insuficiente " + conta.getSaldo());
        }
    }

    @Override
    public void depositar(Conta conta, Double valor) {

        conta.alterarSaldo(+valor);
    }
}
