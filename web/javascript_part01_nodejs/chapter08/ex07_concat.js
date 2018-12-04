var ar1=[1,2,3];
var ar2=[4,5,6,7,8];
var ar3=["suzi","iu","kim"];
var ar4=ar1.concat(ar2);	//ar4=[...ar1, ...ar2]; 와 같은 결과
var ar5=ar1.concat(ar2,ar3);
//	ar5=[...ar1, ...ar2, ...ar3]; 중간에 다른 값 추가가능

console.log(ar4);
console.log(ar5);