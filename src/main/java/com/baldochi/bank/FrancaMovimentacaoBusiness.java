package com.baldochi.bank;

public class FrancaMovimentacaoBusiness extends MovimentacaoPadrao implements EmprestimoBusiness{
    @Override
    public void emprestar(Conta conta, Double valor) {

        Double valorTotal = valor * 1.5;
        conta.setEmprestimo(valorTotal);
    }

    @Override
    public void amortizar(Conta conta, Double valor) {

        conta.setEmprestimo(conta.getEmprestimo() - valor);
    }

    @Override
    public void sacar(Conta conta, Double valor) {

        Double limite = (conta.getSaldo() <0) ? 0.0 : conta.getSaldo() * 1.5;

        if (conta.getSaldo() + limite >= valor) {
            conta.alterarSaldo(-valor);
        } else {
            System.err.println("Saldo + limite insuficiente " + conta.getSaldo());
        }
    }

    @Override
    public void depositar(Conta conta, Double valor) {

    }
}
