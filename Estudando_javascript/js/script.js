//Formas de imprimir mensagens com javascript
console.log("Hello wolrd");
var name = "Guilherme"; //Variavel determinada
document.getElementById("name").innerHTML = name;
// alert("error")

// Declarações

let a, b, c;
a = 1;
b = 2;
c = 3;

name = "Guilherme"; //Variavel dinamica
name = "Luis"; //Reatribuição

export function myFunction() {
  alert("Hello people");
}

import { addc, number } from "/js/no.js";

console.log(addc(number, 23));

// export const EXPECTED_MINUTES_IN_OVEN = 40;

// function remainingMinutesInOven(num) {
//  return EXPECTED_MINUTES_IN_OVEN - num;
// }

// console.log(remainingMinutesInOven(20));

var number1, number2;

number1 = 12;
number2 = 23;
let resul;
resul = number < 18 ? "vc é menor de idade" : "Vc é maior de idade";

console.log(resul);

function add(number1, number2) {
  return number1 + number2;
}
let Variavel = add(12, 43);
alert(Variavel);

// Operadores de atribuição
// soma
// resul = number1 + number2;
// console.log(resul);
// number1 += number2;
// console.log(number1);
// number1 = number1 + number2;
// console.log(number1);
// number1 = ++number1;
// console.log(number1);

// // divisão
// resul = number1 / number2;
// console.log(resul);
// number1 /= number2;
// console.log(number1);


// // subtração
// resul = number1 - number2;
// console.log(resul);
// number1 -= number2;
// console.log(number1);

// // multiplicação
// resul = number1 * number2;
// console.log(resul);
// number1 *= number2;
// console.log(number1);

//operadores em strings
let nome = "Guilherme";
let sobrenome = "Luis";
let nomeCompleto = nome + " " + sobrenome;
console.log(nomeCompleto);