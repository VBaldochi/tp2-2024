package com.baldochi.lista2ex10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o raio da esfera
        System.out.println("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        // Calcular volume
        double volume = calcularVolumeEsfera(raio);

        // Mostrar resultado
        System.out.printf("Volume da esfera com raio %.1f: %.2f\n", raio, volume);

        scanner.close();
    }

    public static double calcularVolumeEsfera(double raio) {
        // Constante PI
        final double PI = Math.PI;

        // Fórmula do volume da esfera
        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        return volume;
    }

}

