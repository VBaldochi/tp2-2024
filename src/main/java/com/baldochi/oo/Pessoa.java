package com.baldochi.oo;

/**
 *
 * @author Baldochi
 */
public class Pessoa {
    protected String nome;

    protected int idade;

    public Pessoa(){
        System.out.println("Classe pessoa instanciada");
        System.out.println("Fatec");
    }

    public void quemSouEu(){
        System.out.println("pessoa");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

}