
import java.util.Scanner;


public class CLASE03_InferenciaDeTipos {
    public static void main(String[] args) {
           
       //Var - inferencia de tipos en Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
         //soutv + tab
        //Para ejecutar Shift + F6 es la tecla para mayúscula
        //Reglas para definir una variable Java
        
         var opcion = 45; //no puede comenzar con número ni caracter especial, si se puede con guión bajo y signo dolar
        //no colocar acentos
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //Ejercicio: Caracteres especiales con Jva
        var nombre = "Natalia";
        System.out.println("Nueva linea: \n" + nombre);//Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre);//Tabulador un espacio para centrar
        System.out.println("\t\t.:MENÚ;.");
        System.out.println("Retroceso: \b\b"+nombre); //Caracter de Retroceso
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");*/
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
    }
}
