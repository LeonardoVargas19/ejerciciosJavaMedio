package com.intermiedo;

import java.util.Random;

//Calcular el cuadrado de un número.
public class Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();
        int n =0;
        n=random.nextInt(100);
        System.out.println("El cuadrado del numero "+n+" = "+Math.pow(n,2));
    }
}
