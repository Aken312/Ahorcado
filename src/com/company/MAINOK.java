package com.company;

import java.util.Random;
import java.util.Scanner;

public class MAINOK {

    public static void main(String[] args) {
        //automatizar las palabras que seran la X
        Scanner sc = new Scanner(System.in);

        String diccionario[] = {"hola","que","miedo","aburrido","genio",
                "ahorcado","perdedor","apto","aprobar"};


        int random = new Random().nextInt(diccionario.length);
        String palabraIncognita =diccionario[random];

        char[] adivinado = new char[palabraIncognita.length()];
        for (int i = 0; i <palabraIncognita.length() ; i++) {
            adivinado[i]='_';
        }

        System.out.println(palabraIncognita);



        System.out.println("La palabra que tienes que encontrar contienes estas letras");
        for (int i = 0; i <adivinado.length ; i++) {
            System.out.print(adivinado[i]+" ");
        }
        //System.out.println(huecos);
        System.out.println();

        int vidas=4;


        for (int i = 0; i <=4 ; i++) {
            System.out.println();
            System.out.println("di una letra");
            System.out.println("te quedan " + (4-i) + " intentos");

            String decision = sc.nextLine();

            for (int j = 0; j <palabraIncognita.length()-1 ; j++) {
                if (decision.equals(palabraIncognita)){
                    System.out.println("victoria lets go");
                    i=4;
                    break;}
                if (decision.charAt(0)==palabraIncognita.charAt(j)){
                    adivinado[j]=palabraIncognita.charAt(j);
                    for (int k = 0; k <adivinado.length ; k++) {
                        System.out.print(adivinado[k]+" ");
                    }

                }


            }
        }

    }


}
