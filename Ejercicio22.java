package com.intermiedo;

import java.util.Scanner;

/*
    Calcula la potencia de un número dado por el usuario
 */
public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        int potencia = 0;

        System.out.println("Digite un numero :");
        numero = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite la a que potencia quiere hace la operacion ");
        potencia = scanner.nextInt();

        double v = potenciaNumero(numero,potencia);

        System.out.println("El resultado con la potencia " + potencia +" es " + v);


    }

    private static double potenciaNumero(double numero, int potencia) {
        return Math.pow(numero,potencia);

    }

}
