package com.company;

import java.util.Random;

public class Diccionario {
    String palabras[] = {"hola", "que", "miedo", "aburrido", "genio",
            "ahorcado", "perdedor", "apto", "aprobar"};

    String palabraRandom() {
        int random = new Random().nextInt(palabras.length);
        String palabraIncognita = palabras[random];

        return palabraIncognita;
    }
}
