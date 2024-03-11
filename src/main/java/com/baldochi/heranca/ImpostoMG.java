package com.baldochi.heranca;

public class ImpostoMG extends Imposto {
    @Override
    public Double calcularImposto(Double valor) {

        if (valor < 100){
            return super.calcularImposto(valor);
        } else if (valor >= 100 && valor <= 1000) {
            return  (valor * 0.12);
        } else {
            return (valor * 0.18);
        }
    }
}
