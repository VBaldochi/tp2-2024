package com.baldochi.lista3ex5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número para a tabuada
        System.out.print("Digite um número para geração da tabuada: ");
        int numero = scanner.nextInt();

        // Exibindo a tabuada de soma
        System.out.println("Tabuada do " + numero + ":");
        System.out.println("Soma:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        // Exibindo a tabuada de multiplicação
        System.out.println("Multiplicação:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
