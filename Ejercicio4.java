package com.intermiedo;

import java.util.Scanner;

//Convertir una cadena de caracteres a mayúsculas.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        System.out.println("Escribe una palabra");
        palabra = scanner.nextLine();
        palabra = palabra.toUpperCase();
        System.out.println(palabra);

    }
}
