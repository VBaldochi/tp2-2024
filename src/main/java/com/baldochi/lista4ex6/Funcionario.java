package com.baldochi.lista4ex6;

import java.util.Date;

public class Funcionario {

    private String nome;
    private int matricula;
    private double salario;
    private Date dataAdmissao;
    private String cpf;

    public Funcionario(String nome, int matricula, double salario, Date dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }

    public void receberAumento(double valorAumento) {
        this.salario += valorAumento;
    }

    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }

    public double calcularImposto() {
        double inss = this.salario * 0.11;
        double ir = 0;
        if (this.salario > 2500) {
            ir = (this.salario - 2500) * 0.175;
        }
        return inss + ir;
    }

    public double calcularGanhoLiquidoMensal() {
        double imposto = this.calcularImposto();
        return this.salario - imposto;
    }

    public double calcularGanhoLiquidoAnual() {
        return this.calcularGanhoLiquidoMensal() * 12;
    }

    @Override
    public String toString() {
        return String.format(
                "**Funcionário:**\n" +
                        "Nome: %s\n" +
                        "Matrícula: %d\n" +
                        "Salário: R$ %.2f\n" +
                        "Data de Admissão: %s\n" +
                        "CPF: %s\n",
                this.nome, this.matricula, this.salario, this.dataAdmissao, this.cpf);
    }
}
