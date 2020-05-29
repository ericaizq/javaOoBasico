package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {

    public static void main(String[] args) {
        Articulo laptop = new Articulo ();
        laptop.nombre = "HP Laptop";
        laptop.cantidadExistencias = 12000;


        laptop.agregarCarrito();
        laptop.guardarParaMasTarde();

        libs.Input.print("Nombre :" + laptop.nombre + "\n");
        libs.Input.print("Cantidad de Existencias :" + laptop.cantidadExistencias + "\n");


    }

}
