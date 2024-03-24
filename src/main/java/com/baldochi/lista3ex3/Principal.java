package com.baldochi.lista3ex3;

import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] w = new int[10];
        int[] k = new int[10];
        int sum = 0;

        System.out.println("Deseja inserir os valores manualmente? (S/N)");
        String userInput = scanner.next();

        if (userInput.equalsIgnoreCase("S")) {
            // Leitura dos vetores informados pelo usuário
            System.out.println("Informe os valores para o vetor w:");
            for (int i = 0; i < 10; i++) {
                w[i] = scanner.nextInt();
            }
            System.out.println("Informe os valores para o vetor k:");
            for (int i = 0; i < 10; i++) {
                k[i] = scanner.nextInt();
            }
        } else {
            // Geração de valores aleatórios para os vetores
            System.out.println("Gerando valores aleatórios para os vetores w e k.");
            for (int i = 0; i < 10; i++) {
                w[i] = random.nextInt(100); // Gera números aleatórios de 0 a 99
                k[i] = random.nextInt(100); // Gera números aleatórios de 0 a 99
            }
        }

        // Cálculo da soma conforme a fórmula
        for (int i = 0; i < 10; i++) {
            sum += w[i] + k[9 - i];
        }

        System.out.println("O resultado da soma é: " + sum);

        scanner.close();
    }
}
