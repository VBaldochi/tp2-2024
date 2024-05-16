package com.pedagio;

public interface Subject {
    void register(Observer observer);

    void removeRegister(Observer observer);

    void notifyObservers();
}