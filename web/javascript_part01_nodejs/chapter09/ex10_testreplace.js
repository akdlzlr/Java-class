
var str = "내가 그린 기린 그림은 암 기린을 그린 암 기린 그림이다.";
var result = str.replace("기린","코끼리");
var result2 = str.replace(/기린\s/g,"호랑이 ");
//	var result2 = str.replace(/기린/g,"호랑이 ");
console.log(str);
console.log(result);
console.log(result2);