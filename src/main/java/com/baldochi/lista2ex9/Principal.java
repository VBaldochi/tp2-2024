package com.baldochi.lista2ex9;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Random random = new Random();

        // Lista para armazenar números sorteados
        boolean[] numerosSorteados = new boolean[100];

        // Gerar matriz da cartela
        int[][] cartela = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;

                // Gerar número aleatório
                do {
                    numero = random.nextInt(100);
                } while (numerosSorteados[numero]);

                // Marcar número como sorteado
                numerosSorteados[numero] = true;

                // Adicionar número à cartela
                cartela[i][j] = numero;
            }
        }

        // Mostrar cartela
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}

