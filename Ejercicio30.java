package com.intermiedo;
/*
        Realizar la multiplicacion de dos matrices
 */

import java.util.Random;

public class Ejercicio30 {


    public static void main(String[] args) {
        int [][] matriz      = new int[5][5];
        int [][] matriz2     = new int[5][5];
        int [][] nuevaMatriz = new int [5][5];
        int cont = 0;
        Random random = new Random();

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = random.nextInt(5);
                matriz2[f][c] = random.nextInt( 5);
                  System.out.printf("1 [ %d ]",matriz[f][c]);
                  System.out.printf(" \t \t \b");
                  System.out.printf(" 2[ %d ]",matriz2[f][c]);
            }
            System.out.printf("\n");

        }

            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("\n");
        for (int f = 0; f < matriz.length; f++) {
            cont =0;
            for (int c = 0; c < matriz.length; c++) {

                cont += matriz[f][c] * matriz2 [f][c];
                nuevaMatriz [f][c] = cont;
                System.out.printf(" [ %d ] ",nuevaMatriz[f][c]);
            }
            System.out.printf("\n");

        }










    }
}
