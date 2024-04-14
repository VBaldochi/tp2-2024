package com.baldochi.bank;

public class BancoAPP {

    public static void main(String[] args) {

        Conta conta = new Conta(123);

        MovimentacaoBusiness movimentacao = new SalimMovimentacaoBusiness();

        movimentacao.depositar(conta, 100.0);
        System.out.println(conta.getSaldo());

        movimentacao.sacar(conta, 50.0);
        System.out.println(conta.getSaldo());

        movimentacao.sacar(conta, 80.0);
        System.out.println(conta.getSaldo());

        MovimentacaoBusiness movimentacao2 = new FeliMovimentacaoBusiness();

        Conta conta2 = new Conta(456);


        movimentacao2.depositar(conta2, 100.0);
        System.out.println(conta2.getSaldo());

        movimentacao2.sacar(conta2, 50.0);
        System.out.println(conta2.getSaldo());

        movimentacao2.sacar(conta2, 80.0);
        System.out.println(conta2.getSaldo());
    }
}
