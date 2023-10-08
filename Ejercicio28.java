package com.intermiedo;

import java.util.Scanner;

/*

      Número combinatorio "n sobre r" (nCr):

 */
public class Ejercicio28 {

    // Funcion que devuelve el dactorial
    public static int calcularFcatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;

        } else {
            return numero * calcularFcatorial(numero - 1);
        }


    }

    // Validar numero

    public static boolean numeroMayor(int numeroR, int numeroN
    ) {
        if (numeroR > numeroN) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, n , c ;
        int numeroN = 0, numeroR;
        boolean bandera = true;


        System.out.println(" Es te programa nCr calcula la cantidad de " +
                "combinaciones posibles de \"r\" elementos elegidos de un conjunto de \"n\" " +
                "elementos. ");


            System.out.println("Digite el valor  N \n ");
            numeroN = scanner.nextInt();
            n = calcularFcatorial(numeroN);
            System.out.println(numeroN);

            System.out.println("Digire el valor r \n ");
            numeroR = scanner.nextInt();
            r = calcularFcatorial(numeroR);
            System.out.println(numeroR);



            if (numeroMayor(r,n) != true ){

                c = n/(r * (calcularFcatorial(numeroN - numeroR )));


                System.out.println("Entonces hay "+ c + " formas diferentes de elegir " + numeroR+ " elementos" +
                        "de un conjunto de  "+ numeroN);

            }else {
                System.out.println(" EL numero de combinaciones posibles dados los numero es  0");
            }






    }
}
