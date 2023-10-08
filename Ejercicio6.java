package com.intermiedo;

import java.util.Scanner;

//Calcular la longitud de una cadena de caracteres.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena ;
        System.out.println("Escribe una cadena");
        cadena=scanner.nextLine();
        System.out.println("La cadena "+cadena+" tiene:"+cadena.length());
    }
}
