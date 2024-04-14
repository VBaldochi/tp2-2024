package com.baldochi.interfaces;

public interface Venda {

    public void vender(String cliente, Double total);

    public Double calcularComissao(Double valorVenda);
}
