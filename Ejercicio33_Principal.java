package com.intermiedo;

public class Ejercicio33_Principal {
    public static void main(String[] args) {

        Ejercicio33_Usuarios persona1 = new Ejercicio33_Usuarios("Shinji Ikari");
        Ejercicio33_Usuarios persona2 = new Ejercicio33_Usuarios("Asuka Langley Sohryu");
        Ejercicio33_Usuarios persona3 = new Ejercicio33_Usuarios("Rei Ayanami");
        Ejercicio33_Usuarios persona4 = new Ejercicio33_Usuarios("Kaworu Nagisa");
        Ejercicio33_Usuarios persona5 = new Ejercicio33_Usuarios("Misato Katsuragi");
        Ejercicio33_Usuarios persona6 = new Ejercicio33_Usuarios("Gendo Ikari");
        Ejercicio33_Usuarios persona7 = new Ejercicio33_Usuarios("Ritsuko Akagi");
        Ejercicio33_Usuarios persona8 = new Ejercicio33_Usuarios("Toji Suzuhara");
        Ejercicio33_Usuarios persona9 = new Ejercicio33_Usuarios("Kensuke Aida");
        Ejercicio33_Usuarios persona10 = new Ejercicio33_Usuarios("Hikari Horaki");

        persona1.editar("Mary Makinami");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }
}
