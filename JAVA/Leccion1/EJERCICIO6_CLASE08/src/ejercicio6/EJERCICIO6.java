
package ejercicio6;

import java.util.Scanner;


public class EJERCICIO6 {
//Guillermo tiene N dólares.Luis tiene la mitad de lo que posee Guillermo.
//Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima
//la cantidad de dinero que tienen entre los tres

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        float Guillermo,Luis,Juan,total;
        
        System.out.println("Digite los dólares que tiene Guillermo");
        
        Guillermo = entrada.nextFloat();
        Luis = Guillermo/2;
        Juan = (Guillermo + Luis)/2;
        total = Guillermo + Luis + Juan;
        
        System.out.println("Guillermo posee: "+ Guillermo);
        System.out.println("Luis posee: "+ Luis);
        System.out.println("Juan posee: "+ Juan);
        
        System.out.println("El total de dolares entre los tres es: "+ total);
        
    }
    
}
