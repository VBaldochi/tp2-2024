package com.baldochi.lista2ex2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] conjunto1 = new int[10];
        int[] conjunto2 = new int[10];

        // Ler o primeiro conjunto
        System.out.println("Digite os elementos do primeiro conjunto:");
        for (int i = 0; i < 10; i++) {
            conjunto1[i] = scanner.nextInt();
        }

        // Ler o segundo conjunto
        System.out.println("Digite os elementos do segundo conjunto:");
        for (int i = 0; i < 10; i++) {
            conjunto2[i] = scanner.nextInt();
        }

        // Encontrar elementos comuns
        System.out.println("Elementos comuns aos dois conjuntos:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (conjunto1[i] == conjunto2[j]) {
                    System.out.println(conjunto1[i]);
                }
            }
        }

        scanner.close();
    }
}
