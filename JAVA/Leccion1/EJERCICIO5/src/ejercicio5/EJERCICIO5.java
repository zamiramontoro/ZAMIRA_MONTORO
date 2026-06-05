//CLASE 9 
//EJERCICIO 5: Hacer un programa que calcule e imprima la suma de las tres calificaciones. 
//Pedir las calificaciones al usuario
package EJERCICIO5;
        
import java.util.Scanner;

public class EJERCICIO5{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float nota1,nota2,nota3,suma;
        
        //Guardamos las tres notas
        System.out.println("Digite las primera calificación:");
        nota1 = Float.parseFloat(entrada.nextLine ());
        
        System.out.println("Digite la segunda calificación:");
        nota2 = Float.parseFloat(entrada.nextLine ());
        
        System.out.println("Digite la tercer calificación:");
        nota3 = Float.parseFloat(entrada.nextLine ());
        
        suma = nota1 + nota2 + nota3;
        
        System.out.println("\nLa suma de las calificaciones es: "+suma);
    }  
}
