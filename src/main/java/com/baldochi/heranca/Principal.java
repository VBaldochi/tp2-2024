package com.baldochi.heranca;

public class Principal {

    public static void main (String[] strings){

        Imposto imposto = new Imposto();

        System.out.println(imposto.calcularImposto(200.00));

        Imposto impostoMG = new ImpostoMG();

        System.out.println(impostoMG.calcularImposto(200.00));

        Imposto impostoBA = new ImpostoBA();

        System.out.println(impostoBA.calcularImposto(10000D));
    }
}
