/* EJERCICIO 6:Pedir números hasta que se teclee un 0, mostrar
la suma de todos los números introducidos
*/
package CLASE4_Ejercicios;

import java.util.Scanner;

public class Ciclos06_ClaseScanner {
    
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int numero;
    int suma = 0;

 System.out.println("Introduce números. Para terminar, introduce 0:");

    numero = entrada.nextInt();

    while (numero != 0){

        suma = suma + numero;

        numero = entrada.nextInt();
    }

      System.out.println("La suma de los números introducidos es: " + suma);
    }
}