package com.pedagio;

import java.util.ArrayList;
import java.util.List;

public class PassagemSubject implements Subject {

    private final List<Observer> observerList = new ArrayList<Observer>();

    private Passagem newPassagem;

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observerList) {
            if (o instanceof PassagemObserver passagemObserver) {
                passagemObserver.processarPassagem(newPassagem);
            }
        }
    }

    public void criarPassagem(Passagem p) {
        this.newPassagem = p;
        this.notifyObservers();
    }
}
