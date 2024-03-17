package com.baldochi.lista2ex11;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try {
            // Ler hora, minuto e segundo do usuário
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a hora (0-23): ");
            int horas = scanner.nextInt();
            System.out.println("Digite o minuto (0-59): ");
            int minutos = scanner.nextInt();
            System.out.println("Digite o segundo (0-59): ");
            int segundos = scanner.nextInt();

            // Converter para segundos
            int totalSegundos = converterParaSegundos(horas, minutos, segundos);

            // Mostrar resultado
            System.out.println("Total de segundos: " + totalSegundos);
        } catch (IllegalArgumentException e) {
            // Exibir mensagem de erro
            System.err.println(e.getMessage());
        }
    }

    public static int converterParaSegundos(int horas, int minutos, int segundos) {
        // Validar hora
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("Hora inválida: " + horas);
        }

        // Validar minuto
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minutos);
        }

        // Validar segundo
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Segundo inválido: " + segundos);
        }

        // Converter para segundos
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        return totalSegundos;
    }
}
