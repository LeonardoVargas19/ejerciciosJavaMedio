package com.intermiedo;

import java.util.Scanner;

/*
  Contar la cantidad de palabras en una frase
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "";

        int cont = 1;
        System.out.println("Escribe una frace");
        palabra = scanner.nextLine();

        char[] arreglo = palabra.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == ' ') {
                cont++;
            }
        }
          System.out.println("La frace tiene " + cont + " palabras");


    }
}
