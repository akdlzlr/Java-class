var ar = [0,1,2,3,4,5,6];

ar.splice(2,0,10,11,12);
console.log(ar);

ar = [0,1,2,3,4,5,6];

ar.splice(2,3);
console.log(ar);

ar = [0,1,2,3,4,5,6];

ar.splice(2, 3, 10, 11, 12);
console.log(ar);