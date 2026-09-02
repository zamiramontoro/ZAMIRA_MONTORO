/*
EJERCICIO 7: Pedir números hasta que se introduzca uno negativo
*/
package CLASE4_Ejercicios;

import java.util.Scanner;


public class Ciclos07_ClaseScanner {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Introduce números. Para terminar, introduce un número negativo:");

        numero = entrada.nextInt();

        while (numero >= 0) {

            numero = entrada.nextInt();
        }

        System.out.println("Se ha introducido un número negativo. Fin del programa.");
    }
}
