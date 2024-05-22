package com.baldochi.padroes.factory;

public abstract class Pizza {

  protected ServicoEntrega servicoEntrega;

  public ServicoEntrega getServicoEntrega() {
    return servicoEntrega;
  }

  public void setServicoEntrega(ServicoEntrega servicoEntrega) {
    this.servicoEntrega = servicoEntrega;
  }

  public abstract void tipoPizza();
    }
