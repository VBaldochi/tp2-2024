package com.baldochi.interfatec;

import java.util.Scanner;

public class QuadradoPerfeito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um quadrado perfeito: ");
        int quadradoPerfeito = scanner.nextInt();

        // Verifica se o número é um quadrado perfeito
        if (!ehQuadradoPerfeito(quadradoPerfeito)) {
            System.out.println(quadradoPerfeito + " não é um quadrado perfeito.");
            return;
        }

        // Calcula e imprime a quantidade de ímpares consecutivos
        int quantidadeImpares = calcularQuantidadeImpares(quadradoPerfeito);
        System.out.println("São necessários " + quantidadeImpares + " números ímpares consecutivos para somar até " + quadradoPerfeito);
    }

    private static boolean ehQuadradoPerfeito(int numero) {
        for (int i = 1; i * i <= numero; i++) {
            if (i * i == numero) {
                return true;
            }
        }
        return false;
    }

    private static int calcularQuantidadeImpares(int quadradoPerfeito) {
        int soma = 1;
        int quantidadeImpares = 1;

        while (soma < quadradoPerfeito) {
            soma += 2;
            quantidadeImpares++;
        }

        return quantidadeImpares;
    }
}
