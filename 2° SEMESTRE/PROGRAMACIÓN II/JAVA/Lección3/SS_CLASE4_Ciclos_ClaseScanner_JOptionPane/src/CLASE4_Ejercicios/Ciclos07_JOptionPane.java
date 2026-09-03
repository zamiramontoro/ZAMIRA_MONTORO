/*
 EJERCICIO 7: Pedir números hasta que se introduzca uno negativo
 */
package CLASE4_Ejercicios;

import javax.swing.JOptionPane;


public class Ciclos07_JOptionPane {
     public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un número:"));

        while (numero >= 0) {

            numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro número:"));
        }

        JOptionPane.showMessageDialog(
                null,
                "Se ha introducido un número negativo. Fin del programa.");
    }
}