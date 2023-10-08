package com.intermiedo;

import java.util.Scanner;
import java.util.Stack;

/*
        Cadena de parentesis equilibrada

 */
public class Ejercicio29 {

    public static Boolean estaBalanceada(String cadena) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(') {
                pila.push(caracter);

            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false;

                } else {
                    pila.pop();
                }
            }
        }
        return pila.isEmpty();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena con parentesis: ");
        String cadena = scanner.nextLine();
        boolean balanceada = estaBalanceada(cadena);

        if (balanceada) {
            System.out.println("La cadena esta abalanceada");
        } else {
            System.out.println("La cadena no esta balanceada");
        }


    }
}
