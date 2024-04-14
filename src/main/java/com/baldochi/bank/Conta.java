package com.baldochi.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

    private Double saldo = 0.0;

    private Integer numero;

    private Double emprestimo;

    private List<String> extrato = new ArrayList<>();

    /**
     * Construto sobrecarregado de conta
     * @param numero
     */


    public Double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Conta(Integer numero) {
        this.numero = numero;
    }

    public Double alterarSaldo(Double valor) {

        if(this.saldo == null) {
            this.saldo = valor;
        } else {
            this.saldo += valor;
        }

        String operacao = (valor > 0) ? "Deposito" : "Retirada";
        extrato.add(new Date() + ": " + operacao + " R$" + valor);

        return this.saldo;
    }

    public void mostrarExtrato() {
        extrato.forEach(e -> {
            System.out.println(e);
        });
    }
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

//    public void setSaldo(Double saldo) {
//        this.saldo = saldo;
//    }

}
