package com.intermiedo;

import java.util.Scanner;

/*
        Calcula la raiz de un numero
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        double numero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero ");
        numero = scanner.nextDouble();

        double v;
        v = raizNumero(numero);
        System.out.println("La raiz del numero es :" + v);

    }

    private static double raizNumero(double numero) {
        return Math.sqrt(numero);
    }
}
