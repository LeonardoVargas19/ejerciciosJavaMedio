package com.intermiedo;

import java.util.Scanner;

//Verificar si un número es primo.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean esPrimo = true;
        int num = 0;
        double x;
        System.out.println("Hola digita un numero");
        num = scanner.nextInt();

        if (num <= 1) {
            esPrimo=false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % 2 == 0) {
                   esPrimo=false;
                    break;
                }
            }
        }
        if (esPrimo){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

    }
}
