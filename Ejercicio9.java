package com.intermiedo;
/*
Verificar si un número es divisible por 5 y 11.
 */

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(258);


        if (n % 5 == 0) {
            System.out.println("Es divisible entre 5 el numero :" + n);
        } else if (n % 11 == 0) {
            System.out.println("Es divisible entre 11 el numero :" + n);
        }else{
            System.out.println("El numero "+n+" no es divisible ni por 5 ni 11.");
        }


    }
}
