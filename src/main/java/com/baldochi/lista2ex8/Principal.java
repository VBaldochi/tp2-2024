package com.baldochi.lista2ex8;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[10][10];

        // Gerar elementos aleatórios na matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        // Calcular soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 10; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Mostrar resultados
        System.out.println("Matriz:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
    }
}

