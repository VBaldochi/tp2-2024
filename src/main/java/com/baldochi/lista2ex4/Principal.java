package com.baldochi.lista2ex4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int valorReferencia;
        int menores = 0;
        int aparicoes = 0;

        // Ler elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ler valor de referência
        System.out.println("Digite o valor de referência:");
        valorReferencia = scanner.nextInt();

        // Analisar valor de referência
        System.out.println("Números maiores que o valor de referência:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > valorReferencia) {
                System.out.println(vetor[i]);
            } else if (vetor[i] < valorReferencia) {
                menores++;
            } else {
                aparicoes++;
            }
        }

        // Mostrar resultados
        System.out.println("Quantidade de números menores que o valor de referência: " + menores);
        System.out.println("Quantidade de aparições do valor de referência: " + aparicoes);

        scanner.close();
    }
}