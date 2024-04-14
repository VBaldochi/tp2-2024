package com.baldochi.interfaces;

public class VendaConsolidadaImplementacao extends VendaConsolidada implements SeguroInterface{

    @Override
    public Double calcularSeguro() {
        return 0.0;
    }
}
