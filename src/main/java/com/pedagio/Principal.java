package com.pedagio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        // Criação das instâncias dos observadores
        Bi bi = new Bi();
        Cliente cliente = new Cliente();
        Contabilidade contabilidade = new Contabilidade();
        Fatura fatura = new Fatura();

        // Criação do Subject
        PassagemSubject passagemSubject = new PassagemSubject();

        // Registro dos observadores no Subject
        passagemSubject.register(bi);
        passagemSubject.register(cliente);
        passagemSubject.register(contabilidade);
        passagemSubject.register(fatura);

        // Criação de algumas passagens de exemplo
        Passagem passagem1 = new Passagem("13579", "2023-11-13T11:34:23", "DCB2445", "NORTEB", 11.50);
        Passagem passagem2 = new Passagem("13579", "2023-11-14T12:45:10", "ABC1234", "SUL", 8.76);
        Passagem passagem3 = new Passagem("44444", "2023-11-15T15:23:45", "GHJ3210", "OESTE", 5.40);
        Passagem passagem4 = new Passagem("44444", "2023-11-16T15:23:45", "GHJ3210", "OESTE", 5.40);

        // Notificação do Subject com as passagens criadas
        passagemSubject.criarPassagem(passagem1);
        passagemSubject.criarPassagem(passagem2);
        passagemSubject.criarPassagem(passagem3);

        // Consultar total por tag
        consultarTotalPorTag("13579");
        consultarTotalPorTag("44444");
//
//        // Consultar passagens por tag e data
//        consultarPassagensPorTagEData("13579", "2023-11-14");
    }

    private static void consultarTotalPorTag(String tag) {
        System.out.println("\n================== Consulta Total por Tag: " + tag + " ==================");
        Fatura fatura = new Fatura();
        Double total = fatura.getValorTotalTag(tag);
        System.out.println("Total: " + total);
    }
//
//    private static void consultarPassagensPorTagEData(String tag, String data) {
//        System.out.println("\n================== Consulta Passagens por Tag e Data: " + tag + " - " + data + " ==================");
//        Fatura fatura = new Fatura();
//        List<Passagem> passagens = fatura.getPassagensPorTagEData(tag, data);
//        for (Passagem passagem : passagens) {
//            System.out.println(passagem);
//        }
//    }
}