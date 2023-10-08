package com.intermiedo;

import java.util.Random;

/*
Calcular el volumen de una esfera.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Random random = new Random();
        double radio = random.nextDouble() * 4;
        double area =0;
        area = (4.0/3.0)*Math.PI * Math.pow(radio,3);
        System.out.println("El area de la esfera con radio "+radio+" su area es "+area);

    }
}
