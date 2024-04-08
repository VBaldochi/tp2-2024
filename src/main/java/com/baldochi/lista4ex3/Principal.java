package com.baldochi.lista4ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    relatorioGeral();
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos (somente nome)");
        System.out.println("3 - Relatório Geral (exibe todas as informações)");
        System.out.println("9 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static void cadastrarAluno() {
        System.out.println("\n--- Cadastrar Aluno ---");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Peso (kg): ");
        float peso = scanner.nextFloat();
        System.out.print("Altura (m): ");
        float altura = scanner.nextFloat();

        Aluno novoAluno = new Aluno(0, nome, idade, peso, altura);
        alunos.add(novoAluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void listarAlunos() {
        System.out.println("\n--- Listar Alunos ---");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }

    private static void relatorioGeral() {
        System.out.println("\n--- Relatório Geral ---");
        for (Aluno aluno : alunos) {
            aluno.exibir();
            System.out.println("IMC: " + String.format("%.2f", aluno.calcularIMC()));
            System.out.println();
        }
    }
}