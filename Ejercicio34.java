package com.intermiedo;

import java.util.Scanner;

/*
Programacion dinameica

 */
public class Ejercicio34 {
   static void cuentaRegresiva (int numeroActual){
        // Si el argumento es menor que 0 ya terminamos
        if ( numeroActual < 0){
            return;
        }else {
            // El caso contrario muestra el numero ejecutandose a si misma con un decremento
            System.out.println(numeroActual);
            cuentaRegresiva(numeroActual-1);
        }

    }

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero a empezar ");
        numero = scanner.nextInt();
        cuentaRegresiva(numero);
    }


}
