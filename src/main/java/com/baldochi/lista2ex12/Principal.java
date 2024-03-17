package com.baldochi.lista2ex12;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try {
            // Ler X e Z do usuário
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor de X: ");
            int x = scanner.nextInt();
            System.out.println("Digite o valor de Z: ");
            int z = scanner.nextInt();

            // Calcular X^Z
            int resultado = calcularPotencia(x, z);

            // Mostrar resultado
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            // Exibir mensagem de erro
            System.err.println(e.getMessage());
        }
    }

    public static int calcularPotencia(int x, int z) {
        // Caso base: X^0 = 1
        if (z == 0) {
            return 1;
        }

        // Caso recursivo: X^Z = X * X^(Z-1)
        if (z > 0) {
            return x * calcularPotencia(x, z - 1);
        }

        // Caso para Z negativo: X^Z = 1 / X^(-Z)
        if (z < 0) {
            return 1 / calcularPotencia(x, -z);
        }

        // Caso inválido: X^Z não definido para Z não inteiro
        throw new IllegalArgumentException("Z não pode ser um número não inteiro: " + z);
    }
}
