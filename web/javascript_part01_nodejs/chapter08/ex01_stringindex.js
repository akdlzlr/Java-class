var ar = [0,1,2,3];

console.log("ar[1] = "+ar[1]);


ar["korea"]=4;
console.log('ar["korea"] = '+ar["korea"]);
console.log('ar.korea = '+ar.korea);


ar[-3.14]=5;
console.log("ar[3.14]="+ar["-3.14"]);
console.log(ar.length);
//	korea와 -3.14는 배열의 요소가 아니다.

var ar2={}

ar2[0]=1;
ar2[1]=2;
//	배열의 요소가 아니다.
console.log(ar2[0],ar[1]);
console.log(ar2.length);