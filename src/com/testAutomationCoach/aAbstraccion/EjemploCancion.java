package com.testAutomationCoach.aAbstraccion;

public class EjemploCancion {

    public static void main(String[] args) {
        Cancion cancionDeAmor = new Cancion();

        cancionDeAmor.artista = "Emmanuel";
        cancionDeAmor.añoLanzamiento = 1990;
        cancionDeAmor.duracion = 3.30;
        cancionDeAmor.letra = "Toda la vida cosechando mil amores.. ";
        cancionDeAmor.titulo = "Toda la vida";


        cancionDeAmor.editar();
        cancionDeAmor.grabar();
        cancionDeAmor.reproducir();


        libs.Input.print("Artista :" + cancionDeAmor.artista + "\n");
        libs.Input.print("Titulo de la cancion :" + cancionDeAmor.titulo + "\n");
        libs.Input.print("Año de lanzamiento :" + cancionDeAmor.añoLanzamiento + "\n");
        libs.Input.print("Duración :" + cancionDeAmor.duracion + " minutos" + "\n");
        libs.Input.print("Letra :" + cancionDeAmor.letra + "\n");

    }

}


