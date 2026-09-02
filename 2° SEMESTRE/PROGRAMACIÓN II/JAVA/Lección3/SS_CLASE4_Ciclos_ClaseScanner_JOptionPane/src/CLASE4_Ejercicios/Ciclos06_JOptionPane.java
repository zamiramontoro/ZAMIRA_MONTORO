/* EJERCICIO 6:Pedir números hasta que se teclee un 0, mostrar
la suma de todos los números introducidos
*/
package CLASE4_Ejercicios;

import javax.swing.JOptionPane;


public class Ciclos06_JOptionPane {
     public static void main(String[] args) {

        int numero;
        int suma = 0;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un número (0 para terminar):"));

        while (numero != 0) {

            suma = suma + numero;

            numero = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce otro número (0 para terminar):"));
        }

        JOptionPane.showMessageDialog(
                null,
                "La suma de los números introducidos es: " + suma);
    }
}
