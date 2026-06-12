
public class CLASE07_OperadoresDeAsignación {
    public static void main(String[] args) {
        
        /*int varNum1 = 1, varNum2 =4;
        var varNum3 = varNum1 + 6 - varNum2; //Una operación
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; //
        System.out.println("varNum1 = " + varNum1);
        
        // -=  *=  /=  %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*/
        
        //Operadores Unarios: Cambio de signo
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);// El resultado será un número negativo
        
        //Operador de negación
        var varC = true; // Esta literal por default en Java es de tipo boolean
        var varD = !varC; // Aquí esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios Incremento Decremento
        var varE = 11; //se va a modificar su valor
        var varF = ++varE;//simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);//se incrementa en la unidad
        System.out.println("varF = " + varF);// va a sumar uno
        //Postincremento del simbolo va despues de la variable
        var varG = 3;
        var varH = varG++;//primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);  
        //Operadores unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable i ya va a estar con decremento
        System.out.println("varJ = " + varJ);
        //postdecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);*/
        
        //Operadores de igualdad y relacionales
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum); //los parentesis son opcionales
        System.out.println("cNum = " + cNum);

        //Operador de diferencia
        var dNum = aNum != bNum; //sin parentesis y no hay inconvenientes
        System.out.println("dNum = " + dNum);

        //Operadores con Cadena
        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        //equals comparacion de referencia de objetos 
        //viendo si los contenidos de cadena tipo 
        //string son iguales
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        //Operadores relacionales mayor o menor
        var gVar = aNum != bNum; //relaciones de una variable y otra
        System.out.println("gVar = " + gVar);
        //Operadores relacionales > < <= >= !=
        var hVar = aNum > bNum;
        System.out.println("hVar = " + hVar);
        
        if (aNum % 2 == 0) {
            System.out.println("Tu numero es PAR");
        } 
        else {
            System.out.println("Tu numero es IMPAR");
        }
        var edad = 15;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } 
        else {
            System.out.println("Es menor de edad");
        }*/
        
        //Operadores condicionales AND
        /*var valorA = 7;
        var valorMinimo = 0;//para crear un rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        //Operadores condionales OR
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) { // || operador OR condicional actua como uno u otro da un verdadero 
            System.out.println("Papa puede asistir al juego del hijo");
        } else {
            System.out.println("Papa no puede asistir al juego del hijo");
        }*/
        
        //Operador Ternario
        /*var resultadoT = (5 > 8) ? "verdadero" : "Falso";
        System.out.println("El resultado es: " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);*/
        
        //Prioridad de Operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16 antes de restarle uno a "Y" sumo 10 +6 

        var solucionAritmetica = 4 + 5 * 6 / 3; //30/3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3; // 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);

    }
}
