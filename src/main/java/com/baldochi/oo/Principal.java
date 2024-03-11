package com.baldochi.oo;

public class Principal {

    public static void main(String[] strings){

        Gerente gerente = new Gerente();

        Empregado emp = new Empregado();

        Pessoa p = new Pessoa();

        pagarSalario(gerente);
        pagarSalario(emp);

        promover(gerente,emp);

        p.quemSouEu();

        Empregado e = new Empregado();
        e.quemSouEu();

        Gerente g = new Gerente();
        g.quemSouEu();

    }

    public static void pagarSalario (Empregado emp){

    }

    public static void promover (Gerente g, Empregado emp){

    }
}
