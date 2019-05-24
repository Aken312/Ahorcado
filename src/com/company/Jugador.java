package com.company;

import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);
    int vidas;
    String decision= sc.nextLine();

    void seleccionVidas(){
        vidas = sc.nextInt();
    }

    void decidirLetra (){
        decision=sc.nextLine();
    }

}
