package ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
     //Una compañia de venta de carros usados  paga a un personal de ventas un salario de $1000
     //mensuales más una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro
     //Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes
     //Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
     //El salario de 1000 lo vamos a manejra como un dato constante, para asignarlo debemos usar la palabra reservada "final"
     
     Scanner entrada = new Scanner (System.in);
     
     final int salarioBase = 1000;
     
     int carrosVendidos;
     float valorCarro, comisionCarro, comisionVentas, salarioTotal;
     
     System.out.println("Digite la cantidad de carros vendidos: ");
     carrosVendidos = (entrada.nextInt());
     
     System.out.println("Ingrese el valor total de las ventas:");
     valorCarro = (entrada.nextFloat());
     
     //comisión de $150 por cada carro vendido 
     comisionCarro = 150 * carrosVendidos;
     
     //5 % del valor de la venta por carro
     comisionVentas = 0.05f * valorCarro;
     
     //salario total 
     salarioTotal = salarioBase + comisionCarro + comisionVentas;
      System.out.println("El salario mensual es: $" + salarioTotal); 
    }
    
}
