package com.baldochi.lista2ex6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar vetor
        double[] vetor = new double[10];

        // Ler média
        System.out.println("Digite a média do vetor:");
        double media = scanner.nextDouble();

        // Ler elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextDouble();
        }

        // Calcular desvio padrão
        double desvioPadrao = 0;
        for (int i = 0; i < 10; i++) {
            desvioPadrao += Math.pow(vetor[i] - media, 2);
        }
        desvioPadrao = Math.sqrt(desvioPadrao / 10);

        // Mostrar resultado
        System.out.println("Desvio padrão: " + desvioPadrao);

        scanner.close();
    }
}
