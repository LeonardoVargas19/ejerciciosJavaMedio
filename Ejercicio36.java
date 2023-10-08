package com.intermiedo;

import java.util.Random;

/*
*   Crear una contraseña
* */
public class Ejercicio36 {

    public static void main(String[] args) {
        Random random = new Random();
        char[] password = new char[10];
        boolean  bandera = true ;
        for (int i = 0; i < password.length; i++) {

           if (bandera) {
               password[i] = (char) random.nextInt(97,122);
               bandera = false;
           }else if (!bandera){
               password[i] = (char) random.nextInt(48,57);
               bandera = true;
           }

            //password[i] = (char) random.nextInt(97,122);
            System.out.printf(" [ %c ]",password[i]);
        }
    }
}
