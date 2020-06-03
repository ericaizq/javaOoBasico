package com.testAutomationCoach.cMethods;

public class GuitarraElectrica {

    String marca;
    String tipoGuitarra;
    String modelo;
    Guitarrista [] famosos;


    public GuitarraElectrica (String marcaGuitarra){
        this.marca = marcaGuitarra;
        this.famosos = new Guitarrista[3];

    }



    public static void tocar () {


    }

    public boolean puedoAgregar(){
        for (int i=0; i< famosos.length; i++){
            if (famosos[i] == null){
                return true;
            }
        }
        return false;

    }


    //atributos, Implemente una clase que represente una guitarra electrica, e incluya como
    //minimo la marca y una lista de famosos que la usen.

}
