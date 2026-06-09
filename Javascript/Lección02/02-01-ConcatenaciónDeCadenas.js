var nombre = "José";
var apellido = " Montes";
var nombreCompleto = nombre+' '+apellido; //Primera Concatenación 
console.log(nombreCompleto);
var nombreCompleto2 = 'Zamira'+' '+'Montoro'; //Segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219; // Lee de izquierda a derecha siguiendo la cadena, lee el número como string
console.log(juntos);
juntos = nombre + 78 + 17; // Aquí se puede diferenciar con paréntesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; // Tercera Concatenación usando el operador simplificado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Perez"; una constante no puede ser modificada
console.log(apellido2); 

