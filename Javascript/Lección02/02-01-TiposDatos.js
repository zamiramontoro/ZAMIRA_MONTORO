//Tipos de datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diráimos que es idéntica
*/
var nombre = "Zamira";//Tipos str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);

var numero = "3000"; //Tipo Numérico
console.log(numero);

var objeto = {
    nombre : "Zamira",
    apellido: "Montoro",
    teléfono: "260487655"

}
console.log(typeof objeto);

//Tipos de datos boleanos
var bandera = true;
console.log(bandera);

//Tipo de Dato Función 
function mifuncion(){}
console.log(typeof mifuncion);

//Tipo de Dato symbol
var simbolo = Symbol("Mi Simbolo");
console.log(typeof simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato Undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato pero su origen es object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ["Citroen", "Audi", "BMW", "Ford", "Mustang", "Mercedes"] ;
console.log(autos);
console.log(typeof autos); //Preguntamos que tipo de dato es:

var z = '';
console.log(z); //Esto se refiere a que es una cadena vacia:
console.log(typeof z); 