package com.baldochi.lista2ex14;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Ler n do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do triângulo: ");
        int n = scanner.nextInt();

        // Imprimir triângulo
        imprimirTriangulo(n);
    }

    public static void imprimirTriangulo(int n) {
        // Loop para cada linha
        for (int i = 1; i <= n; i++) {
            // Espaços em branco
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Nova linha
            System.out.println();
        }
    }
}

