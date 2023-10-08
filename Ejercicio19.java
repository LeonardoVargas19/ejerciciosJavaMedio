package com.intermiedo;

import java.util.Random;

/*

   Ordenar una lista de numeros en orden ascendente.

 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero[] = new int[9];
        int aux = 0;

        // -Vamos a llenar el array con datos random

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(15);
            System.out.printf("[ %s ]", numero[i]);
        }

        // - Vamo a organizarlos por el metodo burbuja
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = 0; j < numero.length - 1 - i; j++) {

                if (numero[j] > numero[j + 1]) {
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;

                }
            }
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.printf("[ %s ]", numero[i]);
        }


    }
}
