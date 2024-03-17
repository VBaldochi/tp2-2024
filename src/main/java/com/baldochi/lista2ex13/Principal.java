package com.baldochi.lista2ex13;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Ler n do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int n = scanner.nextInt();

        // Imprimir linhas com pontos de exclamação
        imprimirExclamacoes(n);
    }

    public static void imprimirExclamacoes(int n) {
        // Loop para cada linha
        for (int i = 1; i <= n; i++) {
            // Imprimir i pontos de exclamação
            for (int j = 0; j < i; j++) {
                System.out.print("!");
            }
            // Nova linha
            System.out.println();
        }
    }
}
