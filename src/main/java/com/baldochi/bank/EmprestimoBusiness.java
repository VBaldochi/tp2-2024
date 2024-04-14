package com.baldochi.bank;

public interface EmprestimoBusiness {

    public void emprestar(Conta conta, Double valor);

    public void amortizar(Conta conta, Double valor);
}
