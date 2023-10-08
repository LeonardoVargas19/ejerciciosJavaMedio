package com.intermiedo;

import java.util.Random;
import java.util.Scanner;
/*
Busqueda binaria

 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busqueda;

        System.out.println("Que numero quieres buscar");
        busqueda = scanner.nextInt();

        int arr[] = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }

        int i = busquedaBinaria(arr, busqueda); // Pasar el arreglo a la función
        System.out.println("El numero tecleado esta en la posision  numero :"+i);
        System.out.println();
    }

    private static int busquedaBinaria(int[] arr, int busqueda) {
        int inicio = 0;
        int fin = arr.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" [%s]", arr[i]);
        }
        System.out.println("-----------------------------\t");

        while (inicio <= fin) {
            int promedio = (inicio + fin) / 2;

            if (busqueda == arr[promedio]) {
                return promedio; // Devolver la posición (índice)
            } else if (busqueda < arr[promedio]) {
                fin = promedio - 1;
            } else {
                inicio = promedio + 1;
            }
        }

        return -1;
    }
}
