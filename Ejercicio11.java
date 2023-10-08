package com.intermiedo;

import java.util.Scanner;

/*
Encontrar el máximo de dos números.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.println("Digite un numero");
        x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite el segundo numero ");
        y = scanner.nextInt();
        if (x == y) {
            System.out.println("Los numero son iguales ");
        } else if (x > y) {
            System.out.println("El numero " + x + " es mayor que el numero " + y);
        } else {
            System.out.println("El numero " + y + " es mayor que el numero " + x);

        }

    }
}
