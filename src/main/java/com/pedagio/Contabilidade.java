package com.pedagio;

public class Contabilidade implements PassagemObserver {

    @Override
    public void processarPassagem(Passagem passagem) {
        this.enviarContabilidade(passagem);
    }

    public void enviarContabilidade(Passagem p) {
        System.out.println("Dados enviados para contabilidade");
    }
}
