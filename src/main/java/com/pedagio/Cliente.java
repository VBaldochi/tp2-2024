package com.pedagio;

public class Cliente implements PassagemObserver{

    @Override
    public void processarPassagem(Passagem passagem) {
        this.notificarCliente(passagem);
    }

    public void notificarCliente (Passagem p) {
        System.out.println("Cliente notificado");
    }

}
