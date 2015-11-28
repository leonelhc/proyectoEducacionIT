package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

public class Auto extends Vehiculo{

    String marca;
    String modelo;
    String color;

    public Auto() {
       super();
    }

    public Auto(int alto, int ancho, int largo, String marca, String modelo, String color) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo=''" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", largo='" + this.getLargo() + '\'' +
                ", ancho='" + this.getAncho() + '\'' +
                ", alto='" + this.getAlto() + '\'' +
                '}';
    }
}
