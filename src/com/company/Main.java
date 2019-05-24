package com.company;

public class Main {

    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        String palabraRandom = diccionario.palabraRandom();


        Panel panel = new Panel();
        panel.crear(palabraRandom);

        Jugador jugador1 = new Jugador();
        jugador1.seleccionVidas();


        panel.mostrar();


        Partida partida = new Partida();

        partida.empezarPartida(jugador1.vidas);

    }
}