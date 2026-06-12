
import java.util.Scanner;


public class CLASE06_TiposPrimitivos {
     public static void main(String[] args)
     {
        //tipos primitivos tipos booleanos
        /*boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");  
        }   
        else {
             System.out.println("La bandera es roja"); 
        }
        
        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //literal tener presente la inferencia de tipos
        var adulto = edad >= 18; //Esta es la expresión booleana
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }*/
        
        //conversión de tipos primitivos
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad +1)); 
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);*/
        
                
        //Pedir un valor
        var entrada = new Scanner(System.in);
        /*System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad );*/
      
        //var adulto = edad >= 18;
        //if (edad >=18){
        //System.out.println("Sos mayor de edad");
        //}
        //else{
        //System.out.println("Sos menor de edad");
        //}

        //Convertir tipos primitivos en Java Parte 2
        // de un tipo entero a un tipo string

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "Programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar =entrada.nextLine().charAt(0);
       
        System.out.println("fraseChar = " + fraseChar);
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
     }
}
