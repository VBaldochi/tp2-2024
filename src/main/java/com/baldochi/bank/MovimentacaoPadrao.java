package com.baldochi.bank;

public abstract class MovimentacaoPadrao implements MovimentacaoBusiness {

    @Override
   public void depositar(Conta conta, Double valor) {

       conta.alterarSaldo(+valor);
   }
}
