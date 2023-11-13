package com.nov12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    Suma de Subconjuntos:
    Dado un conjunto de números enteros, crea un programa que encuentre todos los subconjuntos cuya suma sea igual a un
    valor específico.
 */
public class Subconjuntos {
    public static void main(String[] args) {
        Random random = new Random();
        int [] conjunto = {5, 8, 3, 6, 2 };

        int valorObjetivo = random.nextInt(15);
        System.out.println("El numero elegido es ..."+valorObjetivo);

        List<List<Integer>> resultados = encontrarSubconjuntos(conjunto, valorObjetivo);
        System.out.println("Subconjuntos con suma igual a " + valorObjetivo + ":");
        for (List<Integer> subconjunto : resultados) {
            System.out.println(subconjunto);
        }

    }

    private static List<List<Integer>> encontrarSubconjuntos(int[] conjunto, int valorObjetivo) {
        List<List<Integer>> resultados = new ArrayList<>();
        encontrarSubconjuntosAux(conjunto, valorObjetivo, 0, new ArrayList<>(), resultados);
        return resultados;
    }
    private static void encontrarSubconjuntosAux(int[] conjunto, int objetivo, int inicio,
                                                 List<Integer> actual, List<List<Integer>> resultados) {
        if (objetivo == 0) {
            resultados.add(new ArrayList<>(actual));
            return;
        }

        for (int i = inicio; i < conjunto.length; i++) {
            if (objetivo - conjunto[i] >= 0) {
                actual.add(conjunto[i]);
                encontrarSubconjuntosAux(conjunto, objetivo - conjunto[i], i + 1, actual, resultados);
                actual.remove(actual.size() - 1);
            }
        }
    }

}
