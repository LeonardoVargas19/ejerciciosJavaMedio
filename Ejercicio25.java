package com.intermiedo;

import java.util.Random;

/*
            Encontrar el número más frecuente en una lista.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero[] = new int[12];
        int aux = 0 , cont =0 ,mayor = 0, v_aux=0 ;

        for (int i = 0; i < numero.length; i++) {

            numero[i] = random.nextInt(25);
            System.out.printf("[%s]",numero[i]);
        }


        for (int i = 0; i < numero.length; i++) {
            aux = numero[i];
            cont = 0;

            for (int j = i; j < numero.length - 1; j++) {
                if (aux == numero[j]) {
                    cont ++;
                    if(cont > mayor){
                        mayor = cont;
                        v_aux = numero[j];

                    }
                }
            }
        }
        System.out.println();
        System.out.println("El numero que mas se repite es "+v_aux);



    }
}
