package com.intermiedo;

import java.util.Scanner;

/*
Calcular el factorial de un número entero no negativo.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int counter = 1;

        while (line.hasNextLine()) {
            String lines = line.nextLine();
            System.out.println(counter + " " + lines);
            counter++;
        }


    }
}
