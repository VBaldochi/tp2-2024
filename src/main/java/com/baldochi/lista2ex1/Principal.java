package com.baldochi.lista2ex1;

import java.util.Scanner;

public class Principal {

    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.cadastrarProduto(1, 10, 10.0, 12.0);
        estoque.cadastrarProduto(2, 20, 20.0, 25.0);
        estoque.cadastrarProduto(3, 30, 30.0, 35.0);

        int opcao;
        do {
            exibirMenu();
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    estoque.listarProdutos();
                    break;
                case 2:
                    int codigoProduto = lerCodigoProduto();
                    estoque.listarProdutoPorCodigo(codigoProduto);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("** Opções do menu **");
        System.out.println("1 - Listar todos os produtos");
        System.out.println("2 - Listar um produto por código");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static int lerCodigoProduto() {
        System.out.print("Digite o código do produto: ");
        return Integer.parseInt(entrada.nextLine());
    }
}
