package com.intermiedo;


import java.util.Scanner;

//Calcular el área de un rectángulo.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area=0;

        System.out.println("Calculemos el area de tu rectangulo \n");

        System.out.println("Escribe el lado de tu rectangulo ");
        int lado = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escribe el segundo lado del rectangulo");
        int ladoB= scanner.nextInt();
        area =lado*lado;
        System.out.println("El area de tu rectangulo es ="+area);


    }
}
