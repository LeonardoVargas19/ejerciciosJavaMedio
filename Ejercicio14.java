package com.intermiedo;

import java.util.Random;

/*
Calcular el área de un círculo.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Random random = new Random();
        double radio = random.nextDouble()*6;
        double area =0;

        area = Math.PI* Math.pow(radio,2);


        System.out.println("El are de circulo con radio :"+radio+" Es igual a ="+area);

    }
}
