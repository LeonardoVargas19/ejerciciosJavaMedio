package com.intermiedo;

import java.util.Scanner;

/*
        Factorial con recursividad


 */
public class Ejercicio35 {

    static  int factorial(int numeroF){
        int restultado;
        if(numeroF <2) return 1;

        restultado = factorial(numeroF-1)* numeroF;
        return restultado;


    }
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial de: ");
        n= scanner.nextInt();
        System.out.println(factorial(n));

    }
}
