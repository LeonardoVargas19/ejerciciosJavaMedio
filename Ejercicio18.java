package com.intermiedo;

public class Ejercicio18 {
    static  int numero;
    static {
        numero =10;
        System.out.println("Bloque de inicializacion statico ejecutado ");

    }
    public Ejercicio18(){
        System.out.println( " Constructor ejecutado" );
    }

    public static void main(String[] args) {
        Ejercicio18 ejmeplo = new Ejercicio18();
    }
}
