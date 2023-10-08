package com.intermiedo;

import java.util.Scanner;

//Calcular la suma de los dígitos de un número entero positivo
public class Ejercicio8 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero ");
        n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite el segundo numero ");
        n2 = scanner.nextInt();
        System.out.println("La suma de los dos numero es "+(n1+n2));
    }
}
