package com.intermiedo;

import java.util.Random;

/*
        Calcular el promedio de tres números.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int cont = 0;
        int n1 = 0, n2 = 0, n3 = 0;
        double promedio;
        n1 = random.nextInt(25);
        n2 = random.nextInt(25);
        n3 = random.nextInt(25);
        cont = n1 + n2 + n3;
        promedio = cont / 3;
        System.out.println("El promedio de los tres numero es " +promedio);

    }
}
