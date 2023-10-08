package com.intermiedo;

import java.util.Scanner;
/* Calcular factorial utilizando recursividad */
public class Ejercicio27 {

    public static int calcularFactorial(int numero){

        if( numero == 0 || numero == 1){
            return 1;
        } else {
            return numero *calcularFactorial(numero - 1 );

        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite un numero ");
        numero = scanner.nextInt();

        int factorial = calcularFactorial(numero);
        System.out.println("El factorial del numero:" + numero + " es " + factorial );




    }
}
