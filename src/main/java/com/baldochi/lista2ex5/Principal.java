package com.baldochi.lista2ex5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar vetores
        double[] vetorX = new double[5];
        double[] vetorY = new double[5];

        // Ler primeiro conjunto
        System.out.println("Digite os elementos do primeiro conjunto:");
        for (int i = 0; i < 5; i++) {
            vetorX[i] = scanner.nextDouble();
        }

        // Ler segundo conjunto
        System.out.println("Digite os elementos do segundo conjunto:");
        for (int i = 0; i < 5; i++) {
            vetorY[i] = scanner.nextDouble();
        }

        // Calcular produto escalar
        double produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetorX[i] * vetorY[i];
        }

        // Mostrar resultados
        System.out.println("Primeiro conjunto:");
        for (double valor : vetorX) {
            System.out.print(valor + " ");
        }

        System.out.println("\nSegundo conjunto:");
        for (double valor : vetorY) {
            System.out.print(valor + " ");
        }

        System.out.println("\nProduto escalar: " + produtoEscalar);

        scanner.close();
    }
}
