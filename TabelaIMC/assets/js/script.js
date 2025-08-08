function calculaIMC () {

    const form = document.querySelector(".form");
    const resultado = document.querySelector(".resultado");


    function recebeEventoForm (evento) {
        evento.preventDefault();
        
        const peso = form.querySelector(".peso");
        const altura = form.querySelector(".altura");
        const imc = peso.value / (altura.value ** 2);

        console.log(peso.value, altura.value, imc);

        if(!peso.value && !altura.value) {
            resultado.innerHTML += "<p> Peso e altura inválida </p> <br>";
        } else if (!peso.value) {
            resultado.innerHTML += "<p> Peso inválido </p> <br>";
        } else if (!altura.value) {
            resultado.innerHTML += "<p> Altura inválida </p> <br>";
        } else if(imc < 18.5) {
            resultado.innerHTML += `<p> Seu IMC é ${imc.toFixed(2)} (abaixo do peso) </p> <br>`;
        } else if (imc > 18.5 && imc < 29.9) {
            resultado.innerHTML += `<p> Seu IMC é ${imc.toFixed(2)} (Peso normal) </p> <br>`
        } else if (imc > 30 && imc < 34.9) {
            resultado.innerHTML += `<p> Seu IMC é ${imc.toFixed(2)} (Obesidade grau 1) </p> <br>`
        } else if (imc > 35 && imc < 39.9) {
            resultado.innerHTML += `<p> Seu IMC é ${imc.toFixed(2)} (Obesidade grau 2) </p> <br>`
        } else if (imc > 40) {
            resultado.innerHTML += `<p> Seu IMC é ${imc.toFixed(2)} (Obesidade grau 3) </p> <br>`
        } else if (typeof(peso) !== Number || typeof(altura) !== Number) {
            resultado.innerHTML += `<p> O peso ou altura estão em um formato inválido</p> <br>`
        } else {
            resultado.innerHTML += `<p> Nenhum resultado encontrado, refaça o calculo </p> <br>`
        }

    }

    form.addEventListener('submit', recebeEventoForm);
}

calculaIMC();