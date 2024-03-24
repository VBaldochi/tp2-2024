package com.baldochi.lista3ex7;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        double[] J = new double[100];

        // Preenchendo o vetor J com valores aleatórios para simulação
        for (int i = 0; i < J.length; i++) {
            J[i] = random.nextDouble() * 100; // Valores entre 0 e 100
        }

        double media = calcularMedia(J);
        double desvioPadrao = calcularDesvioPadrao(J, media);

        System.out.println("Média dos valores: " + media);
        System.out.println("Desvio padrão: " + desvioPadrao);
    }

    private static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

    private static double calcularDesvioPadrao(double[] vetor, double media) {
        double somaQuadrados = 0;
        for (double valor : vetor) {
            somaQuadrados += Math.pow(valor - media, 2);
        }
        return Math.sqrt(somaQuadrados / (vetor.length - 1));
    }
}
