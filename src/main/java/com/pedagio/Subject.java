package com.pedagio;

public interface Subject {
    public void register(Observer observer);

    public void removeRegister(Observer observer);

    public void notifyObservers();
}