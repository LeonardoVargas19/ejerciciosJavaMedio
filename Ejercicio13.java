package com.intermiedo;

import java.util.Random;

/*
Verificar si un número es par o impar.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        int x=random.nextInt(152);
        if(x%2==0){
            System.out.println("El numero "+x+" Es par ");
        }else {
            System.out.println("El numero es impar "+x);
        }
    }
}
