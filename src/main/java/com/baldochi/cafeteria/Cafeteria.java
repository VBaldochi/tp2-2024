package com.baldochi.cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {

    public static void main(String[] args) {

        System.out.println("#### Cafeteria Francana ####");

        Bebida cafe = new Cafe();

        System.out.println("Bebida: " + cafe.descricao
                + "\nValor: " + cafe.getValor());

        Bebida leite = new Leite();
        System.out.println("Bebida: " + leite.descricao
                        + "\nValor: " + leite.getValor());

        Bebida concafe = new ConCafe(cafe);
        System.out.println("Bebida: " + concafe.descricao
                        + "\nValor: " + concafe.getValor());

        Bebida conhaque = new Conhaque();

        List<Bebida> listaBebidas = new ArrayList<Bebida>();
        listaBebidas.add(cafe);
        listaBebidas.add(leite);
        listaBebidas.add(conhaque);

        Bebida calecon = new Calecon(listaBebidas);
        System.out.println("Bebida: " + calecon.descricao
                        + "\nValor: " + calecon.getValor());
    }
}
