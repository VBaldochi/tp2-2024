package com.baldochi.abstrata;

public class Teste {

    public static void main(String[] args) {
        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPuopanca();

        poupanca.depositar(100D);
        poupanca.depositar(50D);
        System.out.println(poupanca.getSaldo());

        poupanca.sacar(200D);

        System.out.println(poupanca.getSaldo());

        corrente.depositar(100D);
        corrente.depositar(50D);
        System.out.println(corrente.getSaldo());

        corrente.sacar(200D);

        System.out.println(corrente.getSaldo());
    }
}
