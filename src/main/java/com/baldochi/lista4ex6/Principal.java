package com.baldochi.lista4ex6;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula do funcionário: ");
        int matricula = scanner.nextInt();

        System.out.print("Salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Data de admissão do funcionário (dd/mm/aaaa): ");
        String dataAdmissaoStr = scanner.next();
        Date dataAdmissao = new Date(dataAdmissaoStr);

        System.out.print("CPF do funcionário: ");
        String cpf = scanner.next();

        Funcionario funcionario = new Funcionario(nome, matricula, salario, dataAdmissao, cpf);

        System.out.println("\n**Dados do Funcionário:**");
        System.out.println(funcionario);

        System.out.println("\n**Ganho bruto anual: R$ " + funcionario.calcularGanhoBrutoAnual());
        System.out.println("Imposto pago: R$ " + funcionario.calcularImposto());
        System.out.println("Ganho líquido mensal: R$ " + funcionario.calcularGanhoLiquidoMensal());
        System.out.println("Ganho líquido anual: R$ " + funcionario.calcularGanhoLiquidoAnual());
    }
}

