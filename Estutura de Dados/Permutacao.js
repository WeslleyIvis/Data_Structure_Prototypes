//Refatorar para java pois esta em JS

function contar(min, max, v1, v2) {
  let c1 = 0,
    c2 = 0;
  let vet1 = [],
    vet2 = [];

  for (let i = min; i < max; i += v1) {
    vet1.push(i);
    c1++;
  }

  if (v2)
    for (let i = min; i < max; i += v2) {
      vet2.push(i);
      c2++;
    }

  console.log(`D1 ${v1} = ${c1} || D2 ${v2} = ${c2}`);

  let igual = 0;

  for (let i = 1; i < vet1.length; i++) {
    for (let j = 1; j < vet2.length; j++) {
      if (vet1[i] === vet2[j]) igual++;
    }
  }

  console.log(igual);

  console.log(`total: ${c1 + c2 - igual}`);
}
