package com.baldochi.Pessoas;

public class Principal {

    public static void main(String[] args) {

        /*Pessoa p = new Pessoa();
        p.setNome("João");
        p.setEmail("joao@joao.com.br");
        */

        //System.out.println(p);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("João");
        pj.setEmail("joao@joao.com.br");
        pj.setCnpj("123456789");

        System.out.println(pj);

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("João");
        pf.setEmail("joao@joao.com.br");
        pf.setCpf("123456789");

        System.out.println(pf);

        cadastrarPessoa(pj);
        //cadastrarPessoa(p);
        cadastrarPessoa(pf);
    }

    public static void cadastrarPessoa(Pessoa p) {
        if (p instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) p;
            System.out.println(pf.getCpf());
        } else if (p instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) p;
            System.out.println(pj.getCnpj());
        }
    }
}
