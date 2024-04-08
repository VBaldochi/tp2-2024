package com.baldochi.lista4ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ProdutoEstadual> produtosEstaduais = new ArrayList<>();
        ArrayList<ProdutoNacional> produtosNacionais = new ArrayList<>();
        ArrayList<ProdutoImportado> produtosImportados = new ArrayList<>();

        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("1 – Cadastrar Produto Estadual");
            System.out.println("2 – Cadastrar Produto Nacional");
            System.out.println("3 – Cadastrar Produto Importado");
            System.out.println("4 – Exibir Produtos Estaduais");
            System.out.println("5 – Exibir Produtos Nacionais");
            System.out.println("6 – Exibir Produtos Importados");
            System.out.println("7 – Exibir Todos Produtos");
            System.out.println("9 – SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição do produto estadual: ");
                    scanner.nextLine(); // Limpar o buffer
                    String descricaoEstadual = scanner.nextLine();
                    System.out.print("Valor do produto estadual: ");
                    double valorEstadual = scanner.nextDouble();
                    produtosEstaduais.add(new ProdutoEstadual(descricaoEstadual, valorEstadual));
                    break;
                case 2:
                    System.out.print("Descrição do produto nacional: ");
                    scanner.nextLine();
                    String descricaoNacional = scanner.nextLine();
                    System.out.print("Valor do produto nacional: ");
                    double valorNacional = scanner.nextDouble();
                    produtosNacionais.add(new ProdutoNacional(descricaoNacional, valorNacional));
                    break;
                case 3:
                    System.out.print("Descrição do produto importado: ");
                    scanner.nextLine();
                    String descricaoImportado = scanner.nextLine();
                    System.out.print("Valor do produto importado: ");
                    double valorImportado = scanner.nextDouble();
                    System.out.print("Taxa de importação do produto importado: ");
                    double taxaImportacao = scanner.nextDouble();
                    produtosImportados.add(new ProdutoImportado(descricaoImportado, valorImportado, taxaImportacao));
                    break;
                case 4:
                    System.out.println("Produtos Estaduais:");
                    for (ProdutoEstadual produto : produtosEstaduais) {
                        produto.relatorio();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Produtos Nacionais:");
                    for (ProdutoNacional produto : produtosNacionais) {
                        produto.relatorio();
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Produtos Importados:");
                    for (ProdutoImportado produto : produtosImportados) {
                        produto.relatorio();
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Todos os Produtos:");
                    for (ProdutoEstadual produto : produtosEstaduais) {
                        produto.relatorio();
                        System.out.println();
                    }
                    for (ProdutoNacional produto : produtosNacionais) {
                        produto.relatorio();
                        System.out.println();
                    }
                    for (ProdutoImportado produto : produtosImportados) {
                        produto.relatorio();
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }
}
