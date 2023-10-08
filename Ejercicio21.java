package com.intermiedo;

/*
        Devolver los numeros primos de un rango dado por el usuario
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v_inicio = 0;
        double v_final = 0;
        Boolean esPrimo = true;

        System.out.println("Escribe el primer numero de tu rango");
        v_inicio = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Escribe el final de tu rango ");
        v_final = scanner.nextDouble();
        System.out.println("Número primos en el rango [" + v_inicio + " , " + v_final + " ];");

        for (double i = v_inicio; i < v_final; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " ");
            }
        }


    }

    private static boolean esPrimo(double numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= numero) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
}
