package com.baldochi.lista3ex2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] id = new int[10];
        double[] preco = new double[10];
        int[] qtdVenda = new int[10];
        double totalVendas = 0.0;
        int totalVendidos = 0;

        // Leitura das entradas de vendas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o código do produto, valor unitário e quantidade vendida, separados por espaço:");
            id[i] = scanner.nextInt();
            preco[i] = scanner.nextDouble();
            qtdVenda[i] = scanner.nextInt();
        }

        // Exibição da listagem de produtos e cálculos
        System.out.println("CODIGO V. UNIT QTD TOTAL ITEM");
        for (int i = 0; i < 10; i++) {
            double totalItem = preco[i] * qtdVenda[i];
            totalVendas += totalItem;
            totalVendidos += qtdVenda[i];
            System.out.printf("%d R$%.2f %d R$%.2f\n", id[i], preco[i], qtdVenda[i], totalItem);
        }

        double mediaVendidos = totalVendidos / 10.0;
        double mediaPreco = totalVendas / totalVendidos;
        double mediaTotal = totalVendas / 10;

        System.out.println("Quantidade total de itens vendidos: " + totalVendidos);
        System.out.println("Valor total vendido: R$" + totalVendas);
        System.out.println("Quantidade média de itens por venda: " + mediaVendidos);
        System.out.println("Valor unitário médio: R$" + mediaPreco);
        System.out.println("Média do valor total por item: R$" + mediaTotal);

        // Consulta por código de produto
        System.out.println("Informe um código de produto para consulta:");
        int searchCode = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (id[i] == searchCode) {
                System.out.printf("Código: %d, Valor Unitário: R$%.2f, Quantidade: %d, Total Item: %.2f\n",
                        id[i], preco[i], qtdVenda[i], preco[i] * qtdVenda[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Código de produto não encontrado.");
        }

        scanner.close();
    }
}
