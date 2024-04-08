package com.baldochi.lista4ex5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Jogador> jogadores = new ArrayList<>();

        // Cadastrando 11 jogadores
        jogadores.add(new Jogador(1, "Neymar", "Ney", new Date(1992, 2, 5), 10, "Atacante", 90));
        jogadores.add(new Jogador(2, "Thiago Silva", "Monstro", new Date(1984, 9, 22), 3, "Zagueiro", 85));
        jogadores.add(new Jogador(3, "Casemiro", "Casemiro", new Date(1992, 2, 23), 5, "Volante", 80));
        jogadores.add(new Jogador(4, "Marquinhos", "Marquinhos", new Date(1994, 5, 14), 4, "Zagueiro", 83));
        jogadores.add(new Jogador(5, "Alex Sandro", "Alex Sandro", new Date(1991, 1, 26), 6, "Lateral-esquerdo", 82));
        jogadores.add(new Jogador(6, "Lucas Paquetá", "Paquetá", new Date(1997, 8, 27), 8, "Meia-atacante", 84));
        jogadores.add(new Jogador(7, "Vinicius Junior", "Vini Jr", new Date(2000, 7, 12), 20, "Atacante", 88));
        jogadores.add(new Jogador(8, "Fred", "Fred", new Date(1993, 3, 5), 9, "Atacante", 81));
        jogadores.add(new Jogador(9, "Fabinho", "Fabinho", new Date(1993, 10, 23), 15, "Volante", 87));
        jogadores.add(new Jogador(10, "Alisson Becker", "Alisson", new Date(1992, 10, 2, 0, 0, 0), 1, "Goleiro", 89));
        jogadores.add(new Jogador(11, "Danilo", "Danilo", new Date(1991, 7, 15), 2, "Lateral-direito", 86));

        // Simulando recebimento de cartões
        jogadores.get(2).aplicarCartao(2); // Casemiro recebe 2 cartões amarelos
        jogadores.get(6).aplicarCartao(1); // Paquetá recebe 1 cartão amarelo
        jogadores.get(10).aplicarCartao(1); // Alisson recebe 1 cartão vermelho

        // Simulando lesões
        jogadores.get(4).sofrerLesao(); // Marquinhos se lesiona
        jogadores.get(8).sofrerLesao(); // Fred se lesiona

        // Imprimindo a lista do "plantel"
        System.out.println("**Plantel:**");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }

        System.out.println("\n**Jogadores aptos a jogar:**");
        for (Jogador jogador : jogadores) {
            if (jogador.estaAptoAJogar()) {
                System.out.println(jogador.getNome());
            }
        }
    }
}
