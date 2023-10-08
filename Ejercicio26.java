package com.intermiedo;

import java.util.Stack;

/*
    último en entrar, primero en salir" (LIFO, por sus siglas en inglés, Last-In-First-Out).
    Esto significa que el elemento que se inserta en último lugar es el primero en ser retirado.
    Las pilas se utilizan comúnmente para llevar un seguimiento de elementos en un orden específico,
    como en el caso de un historial de navegación en un navegador web o para realizar un seguimiento
    de las llamadas de funciones en una aplicación.
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        // Crear una pila
        Stack<String> pila = new Stack<>();
        //Insertar datos en la pila
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");

        // Acceder y eliminar el elemento en la parte superior de la pila
        String elemento = pila.pop();
        System.out.println("Elemento recuperado de la pila : " + elemento);

        //Obtener el elemento en la árte superios de la pila sin eliminarlo

        String elementoEnLaCima = pila.peek();
        System.out.println("Elemento en la parte superior de la pila: "+elementoEnLaCima);

        // Comprobar si la pila esta vacia
        boolean estaVacia = pila.isEmpty();
        System.out.println("¿La piala está vacía? "+ estaVacia);
        System.out.println(pila);
    }
}
