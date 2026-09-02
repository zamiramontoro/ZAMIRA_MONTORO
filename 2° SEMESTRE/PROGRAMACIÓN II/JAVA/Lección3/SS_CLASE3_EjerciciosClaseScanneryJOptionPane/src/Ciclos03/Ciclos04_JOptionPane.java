/*
EJERCICIO 4: Pedir números hasta que se teclee uno negativo, 
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
 */
package Ciclos03;

import javax.swing.JOptionPane;

public class Ciclos04_JOptionPane {
     public static void main(String[] args) {
         
      int numero;
      int contador = 0;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
      while(numero >= 0){
          
          contador++;
          
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
      }
        JOptionPane.showMessageDialog(null, "Se han introducido "+contador+" números"); 
    }
}
