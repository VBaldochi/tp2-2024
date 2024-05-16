package com.pedagio;

public interface PassagemObserver extends Observer {
    void processarPassagem(Passagem passagem);
}