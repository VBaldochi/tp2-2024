package com.baldochi.abstrata;

public class ContaEspecial extends ContaCorrente{

    @Override
    public void depositar(Double valor) {

        super.depositar(valor);

        if (super.saldo >=0){
            super.limite =(super.saldo * 2);
        }
    }

    @Override
    public Double sacar(Double valor) {

        Double valorSacado = super.sacar(valor);

        if(saldo < 0){
            super.limite = 0D;
        }else{
            super.limite = (super.saldo * 2);
        }

        return valorSacado;
    }

    @Override
    public Double calcularTarifa() {

        if (super.saldo > 0){
            return (super.saldo * 0.015);
        }else {
            return (super.saldo * 0.015) + 50.0;
        }
    }
}
