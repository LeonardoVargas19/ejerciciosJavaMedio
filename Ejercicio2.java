package com.intermiedo;

import java.util.Scanner;

//Verificar si un número es positivo, negativo o cero.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        System.out.println("Escribe el un numero ");
        x = scanner.nextInt();
        if (x > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
