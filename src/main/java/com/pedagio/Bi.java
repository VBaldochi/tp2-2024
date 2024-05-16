package com.pedagio;

public class Bi implements PassagemObserver {

    @Override
    public void processarPassagem(Passagem passagem) {
        this.enviarBi(passagem);
    }

    public void enviarBi(Passagem p) {
        System.out.println("Dados enviados para equipe de BI");

    }
}
