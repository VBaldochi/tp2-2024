package com.baldochi.oo;

public class Empregado extends Pessoa {

    public Empregado(){
        super();
        System.out.println("Empregado instanciado");
    }

    @Override
    public void quemSouEu() {
        System.out.println("Classe empregado");
    }
}
