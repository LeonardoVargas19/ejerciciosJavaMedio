package com.intermiedo;

import java.util.Random;

/*
Encontrar el mínimo de dos números.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(25);
        int y = random.nextInt(25);
        if (x==y){
            System.out.println("Los numero son iguales ");
        } else if (x > y) {
            System.out.println("El numero menor es "+y);
        }else {
            System.out.println("El numero menor es "+x);
        }

    }

}
