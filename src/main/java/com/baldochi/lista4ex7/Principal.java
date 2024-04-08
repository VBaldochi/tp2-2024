package com.baldochi.lista4ex7;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado 1 do retângulo: ");
        float lado1 = scanner.nextFloat();

        System.out.print("Lado 2 do retângulo: ");
        float lado2 = scanner.nextFloat();

        Retangulo retangulo = new Retangulo(lado1, lado2);

        System.out.println("\n**Dados do Retângulo:**");
        System.out.println(retangulo);
    }
}

