package com.baldochi.lista2ex3;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[100];

        // Gerar elementos aleatórios
        for (int i = 0; i < 100; i++) {
            vetor[i] = random.nextInt(100) + 1;
            System.out.print(vetor[i]);
            if (i < 99) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }

        // Calcular estatísticas
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int pares = 0;

        for (int i = 0; i < 100; i++) {
            // Atualizar maior e menor
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }

            // Contar números pares
            if (vetor[i] % 2 == 0) {
                pares++;
            }

            // Somar elementos
            soma += vetor[i];
        }

        // Calcular média
        double media = (double) soma / 100;

        // Calcular porcentagem de pares
        double porcentagemPares = (double) pares / 100 * 100;

        // Mostrar resultados
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média dos elementos: " + media);
        System.out.println("Porcentagem de números pares: " + porcentagemPares + "%");
    }
}