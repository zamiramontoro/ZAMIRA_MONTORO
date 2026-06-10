// Ampliando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ámbito global
Un error es que se sobreescriba
*/

var nombre = "Zamira";
nombre = "Natali";
console.log(nombre);

function saludar(){
    var nombre2 = "Carmela";
    console.log(nombre2);    
}
//console.log(nombre2); // Aquí no lee el dato en la función


if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); // En la función funcionó correctamente en la estructura if falló

/*
let: esta puede ser reasignada en cualquier momento
ladiferencia es que su ambito es de bloque, 
solo disponible dentro de un bloeque de llaves
o dentro de una función
*/

function saludar2(){
    let nombre2 = "Zamira";
    console.log(nombre2); 
}
//console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignados
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
fechaNacimiento = 2003;
console.log(fechaNacimiento); //Solo se ejecuta el console aterior