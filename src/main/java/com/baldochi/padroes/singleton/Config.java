package com.baldochi.padroes.singleton;

public class Config {

    private static Config instance;

    private String propertie;

    private Config(){

    }

    public static Config getInstance(){

        if(instance == null){
            instance = new Config();
        }

        return instance;
    }

    public String getPropertie(){
        return propertie;
    }

    public void setPropertie(String propertie){
        this.propertie = propertie;
    }
}
