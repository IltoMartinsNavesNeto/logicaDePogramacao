let cpf = '355.330.350-60';
let cpfLimpo = cpf.replace(/\D+/g, '');

cpfArray = Array.from(cpfLimpo);

let invertido = cpfArray.slice().reverse();

let primeiroCalculo =  invertido.map((ac, val) => ac * val)
    .slice(2)
    .reduce((acc, num) => ((acc += num) % 11)); 

primeiroCalculo = 11 - primeiroCalculo;

if(primeiroCalculo >= 10) primeiroCalculo = 0;

primeiroCalculo === Number(cpfArray[9]) ? console.log("Primeiro número é válido") : console.log("Primeiro número é inválido");

let segundoCalculo = invertido.map((ac, val) => ac * (val + 1))
    .slice(1)
    .reduce((acc, num) => ((acc += num) % 11)); 

segundoCalculo = 11 - segundoCalculo;

if(segundoCalculo >= 10) segundoCalculo = 0;

segundoCalculo === Number(cpfArray[10]) ? console.log("Segundo número é válido") : console.log("Segundo número é inválido");