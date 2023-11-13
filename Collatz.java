package com.nov12;

import java.util.Scanner;

/*
Secuencia de Collatz:
Implementa un programa que genere la secuencia de Collatz para un número dado, siguiendo las reglas: si el número es par
, divídelo por 2; si es impar, multiplícalo por 3 y suma 1. Repite este proceso hasta llegar al número 1.
 */
public class Collatz {
    public static void main(String[] args) {
        double numero =0;
        Scanner scanner = new Scanner(System.in);
       do{

        System.out.println("*** Digite un numero positivo ");
        numero = scanner.nextDouble();
       }while(numero<0);

        while(numero != 1){
            if (numero %2 ==0){
                System.out.println(numero+"..\t");
                numero = numero / 2 ;
            }else {
                System.out.println(numero+"..\t");
                numero = (numero *3) +1;
            }

        }
        System.out.println(numero);








    }
}
