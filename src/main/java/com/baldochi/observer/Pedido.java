package com.baldochi.observer;

public class Pedido {

    private String cliente;

    private Integer codigo;

    private Double totalPedido;

    /**
     *  Construtor sobrecarregado de pedido
     * @param cliente
     * @param codigo
     * @param totalPedido
     */

    public Pedido(String cliente, Integer codigo, Double totalPedido) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.totalPedido = totalPedido;
    }
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }
}
