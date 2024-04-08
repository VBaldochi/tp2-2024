package com.baldochi.lista4ex7;

public class Retangulo {

    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularArea();
        calcularPerimetro();
    }

    public void calcularArea() {
        this.area = lado1 * lado2;
        System.out.println("Área do retângulo: " + this.area);
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * lado1 + 2 * lado2;
        System.out.println("Perímetro do retângulo: " + this.perimetro);
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
        calcularArea();
        calcularPerimetro();
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
        calcularArea();
        calcularPerimetro();
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return String.format(
                "Retângulo:\n" +
                        "Lado 1: %.2f\n" +
                        "Lado 2: %.2f\n" +
                        "Área: %.2f\n" +
                        "Perímetro: %.2f\n",
                lado1, lado2, area, perimetro);
    }
}
