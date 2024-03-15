package com.baldochi.lista2ex7;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[5];

        // Ler elementos do vetor x
        System.out.println("Digite os elementos do vetor x:");
        for (int i = 0; i < 5; i++) {
            x[i] = scanner.nextInt();
        }

        // Ler elementos do vetor y
        System.out.println("Digite os elementos do vetor y:");
        for (int i = 0; i < 5; i++) {
            y[i] = scanner.nextInt();
        }

        // Operações com vetores
        int[] soma = somaVetores(x, y);
        int[] produto = produtoVetores(x, y);
        int[] diferenca = diferencaVetores(x, y);
        int[] intersecao = intersecaoVetores(x, y);
        //int[] uniao = uniaoVetores(x, y);

        // Mostrar resultados
        System.out.println("Soma:");
        for (int valor : soma) {
            System.out.print(valor + " ");
        }

        System.out.println("\nProduto:");
        for (int valor : produto) {
            System.out.print(valor + " ");
        }

        System.out.println("\nDiferença:");
        for (int valor : diferenca) {
            System.out.print(valor + " ");
        }

        System.out.println("\nIntersecção:");
        for (int valor : intersecao) {
            System.out.print(valor + " ");
        }

       // System.out.println("\nUnião:");
        //for (int valor : uniao) {
          //  System.out.print(valor + " ");
        //}

        scanner.close();
    }

    // Funções para calcular os vetores resultantes
    private static int[] somaVetores(int[] x, int[] y) {
        int[] soma = new int[5];
        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
        }
        return soma;
    }

    private static int[] produtoVetores(int[] x, int[] y) {
        int[] produto = new int[5];
        for (int i = 0; i < 5; i++) {
            produto[i] = x[i] * y[i];
        }
        return produto;
    }

    private static int[] diferencaVetores(int[] x, int[] y) {
        int[] diferenca = new int[5];
        int count = 0;

        // Percorrer o vetor x
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;

            // Verificar se o elemento de x existe em y
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }

            // Se o elemento não existe em y, adiciona na diferença
            if (!encontrado) {
                diferenca[count++] = x[i];
            }
        }

        // Retornar a diferença com o tamanho correto
        return Arrays.copyOf(diferenca, count);
    }

    private static int[] intersecaoVetores(int[] x, int[] y) {
        int[] intersecao = new int[5];
        int count = 0;

        // Percorrer o vetor x
        for (int i = 0; i < 5; i++) {

            // Verificar se o elemento de x existe em y
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    intersecao[count++] = x[i];
                    break; // Sai do loop interno após encontrar o elemento
                }
            }
        }

        // Retornar a interseção com o tamanho correto
        return Arrays.copyOf(intersecao, count);
    }
}