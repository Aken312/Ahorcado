package com.company;

public class Panel {

    char[] huecos;   // { '_', '_', '_' }


    void crear(String palabraIncognita){
        huecos = new char[palabraIncognita.length()];
        for (int i = 0; i <palabraIncognita.length() ; i++) {
            huecos[i] = '_';
        }
    }

    void mostrar(){
        System.out.println("La palabra que tienes que encontrar contienes estas letras");
        for (int i = 0; i <huecos.length ; i++) {
            System.out.print(huecos[i]+" ");
        }
    }
}
