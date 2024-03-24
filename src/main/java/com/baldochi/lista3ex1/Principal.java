package com.baldochi.lista3ex1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] referencia = new int[50];
        int menorReferencia = 0;
        int igualReferencia = 0;
        double porcentagem = 0.0;

        // Leitura dos 10 números inteiros.
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Solicitação do valor de referência.
        System.out.println("Digite o valor de referência:");
        int valorReferencia = scanner.nextInt();

        // Processamento e exibição dos resultados.
        System.out.println("Números maiores que o valor de referência:");
        for (int number : numbers) {
            if (number > valorReferencia) {
                System.out.println(number);
            } else if (number < valorReferencia) {
                menorReferencia++;
            } else {
                igualReferencia++;
            }
        }

        System.out.println("Quantidade de números menores que o valor de referência: " + menorReferencia);
        System.out.println("Quantas vezes o valor de referência aparece: " + igualReferencia);

        segundoArray(referencia);


        for (int num : numbers) {
            int count = 0;
            for (int refNum : referencia) {
                if (num == refNum) {
                    count++;
                }
            }
            System.out.println("Número " + num + " aparece " + count + " vezes no segundo vetor.");
        }


        for (int num : referencia) {
            for (int primeiroValor : numbers) {
                if (num == primeiroValor) {
                    porcentagem++;
                    break; // Evita contar o mesmo número mais de uma vez.
                }
            }
        }
        System.out.println("Porcentagem de números do vetor de 50 posições que constam no primeiro vetor: " + (porcentagem / 50 * 100) + "%");

        scanner.close();
    }

    private static void segundoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1; // Números aleatórios entre 1 e 50.
        }
    }
}

