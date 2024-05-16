package com.pedagio;

public class Passagem {
    private String tag;
    private String horaDate;
    private String placa;
    private String praca;
    private Double valor;

    public Passagem (String tag, String horaDate, String placa, String praca, Double valor) {
        this.tag = tag;
        this.horaDate = horaDate;
        this.placa = placa;
        this.praca = praca;
        this.valor = valor;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getHoraDate() {
        return horaDate;
    }

    public void setHoraDate(String horaDate) {
        this.horaDate = horaDate;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
