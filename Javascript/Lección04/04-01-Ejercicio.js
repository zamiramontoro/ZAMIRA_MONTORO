/*const se utiliza para valores constantes que no
pueden ser reasignados*/

const fechaNacimiento1 = 2006;
console.log(fechaNacimiento1);

/* fechaNacimiento = 2003;
/* console.log(fechaNacimiento); // solo se ejecuta console anteior

/*
Evitar repetir tu código
DRY (Don't Repeat Yourself)
*/

// let days = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];
let days = "Sábado";
switch (days){
    case "Lunes":
        console.log("hoy es "+days)
        break;
    case "Martes":
        console.log("hoy es "+days)
        break;
    case "Miercoles":
        console.log("hoy es "+days)
        break;
    case "Jueves":
        console.log("hoy es "+days)
        break;
    case "Viernes":
        console.log("hoy es "+days)
        break;
    case "Sábado":
        console.log("hoy es "+days)
        break;
    case "Domingo":
        console.log("hoy es "+days)
        break;
    default:
        console.log("Error en el ingreso del día de la semana")
}

//Esta es la opción mejorada

let days2 = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];
function getDay(n) {
    if (n < 1 || n > 7) {
        throw new Error('out of range');
    }
    return days2[n - 1];
}

try {
    console.log(getDay(1)); // Lunes
    console.log(getDay(5)); // Viernes
    console.log(getDay(8)); // Error
} catch (err) {
    console.log(err.message);
}

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
    var edad2 = 33;
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
