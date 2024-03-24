package com.baldochi.lista3ex4;

import java.util.Random;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        int[] A = new int[20];
        int[] B = new int[20];

        // Preenchendo A e B com números aleatórios entre 0 e 50.
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(51); // 0 a 50
            B[i] = random.nextInt(51); // 0 a 50
        }

        // Juntando A e B em C, removendo duplicados depois.
        int[] tempC = new int[A.length + B.length];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (!duplicados(tempC, A[i], index)) {
                tempC[index++] = A[i];
            }
            if (!duplicados(tempC, B[i], index)) {
                tempC[index++] = B[i];
            }
        }

        // Copiando os elementos únicos para C.
        int[] C = Arrays.copyOf(tempC, index);

        // Ordenando C.
        Arrays.sort(C);

        // Exibindo os vetores A, B e C.
        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B: " + Arrays.toString(B));
        System.out.println("Vetor C (Elementos únicos e ordenados de A e B): " + Arrays.toString(C));
    }

    // Método auxiliar para verificar se um valor está presente no vetor.
    private static boolean duplicados(int[] array, int value, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
