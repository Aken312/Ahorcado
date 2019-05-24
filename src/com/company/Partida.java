package com.company;

import java.util.Random;

public class Partida {

    void mostrarPanel(){

    }

    void empezarPartida(int vidas){
        for (int i = 0; i <= vidas; i++) {
            pedirLetra();
            mostrarVidas(vidas, i);

        }
    }

    void pedirLetra(){
        System.out.println();
        System.out.println("di una letra");
    }

    void mostrarVidas(int vidas, int i){
        System.out.println("te quedan " + (vidas - i) + " intentos");
    }
}

