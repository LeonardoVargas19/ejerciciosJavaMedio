package com.nov12;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

/*
    Detección de Duplicados:
    Escribe un programa que encuentre los elementos duplicados en un array.
 */
public class Duplicados {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numero = new int[8];

        for (int i = 0; i < numero.length; i++) {
            numero[i]= random.nextInt(15);
            System.out.printf("[%d]",numero[i]);
        }



        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[i] == numero[j]) {
                    System.out.println("El número " + numero[i] + " se repite.");
                }
            }
        }


    }
}
