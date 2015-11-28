package ar.com.educacionit.ar.com.educacionit.vehiculos.pruebas;

import ar.com.educacionit.base.entidades.Persona;
import ar.com.educacionit.base.entidades.Vehiculo;
import ar.com.educacionit.base.entidades.Vendedor;
import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;

public abstract class Programa {

    public static void main(String[] args){

        Auto auto = new Auto(100,50,500, "Fiat", "Duna","Blanco");
        Comprador comprador1 = new Comprador("Juan", "Perez", "32760349", 50000);
        Vendedor vendedor1 = new Vendedor("Roberto", "Vendor", "32123123", 0);

        System.out.println(auto.toString());
        System.out.println(comprador1.toString());
        System.out.println(vendedor1.toString());

        System.out.println("HOLA GIT");

    }
}
