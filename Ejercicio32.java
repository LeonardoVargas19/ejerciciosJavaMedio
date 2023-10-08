package com.intermiedo;

/*
    Problema de la mochila
*/
public class Ejercicio32 {
    public static void main(String[] args) {

        int[] peso = {2, 3, 4, 5};
        int[] valores = {3, 4, 5, 6};
        int capacidadMochila = 5;
        int[][] dp = new int[peso.length + 1][capacidadMochila + 1];

        for (int i = 0; i <= peso.length; i++) { // Cambia "<" por "<="
            for (int j = 0; j <= capacidadMochila; j++) { // Cambia "<" por "<="
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (peso[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - peso[i - 1]] + valores[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int i = peso.length;
        int j = capacidadMochila;

        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                System.out.println("Elemento " + i + " - Peso: " + peso[i - 1] + ", Valor: " + valores[i - 1]);
                j = j - peso[i - 1];
            }
            i--;
        }
    }
}
