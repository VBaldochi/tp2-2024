package com.baldochi.lista3ex6;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        int[] W = new int[100];
        int[] J = new int[100];

        // Preenchimento dos vetores com números aleatórios entre 0 e 100
        for (int i = 0; i < 100; i++) {
            W[i] = random.nextInt(101); // 0 a 100, inclusive
            J[i] = random.nextInt(101); // 0 a 100, inclusive
        }

        // Cálculo de max(W), min(J), média(W) e média(J)
        int maxW = max(W);
        int minJ = min(J);
        double mediaW = media(W);
        double mediaJ = media(J);

        // Cálculo de t
        double t = (maxW * (minJ + 1)) / (mediaW + mediaJ);

        // Exibição do resultado
        System.out.println("Valor de t: " + t);
    }

    private static int max(int[] vetor) {
        int maximo = vetor[0];
        for (int valor : vetor) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }

    private static int min(int[] vetor) {
        int minimo = vetor[0];
        for (int valor : vetor) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
        return minimo;
    }

    private static double media(int[] vetor) {
        double soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
}
