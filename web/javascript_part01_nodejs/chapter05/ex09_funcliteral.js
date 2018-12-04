
var add = function (a,b){
	return a+b;
}
//	익명함수이다.


console.log("2 + 3 = "+ add(2,3));

//=================================================

console.log("2 + 3 = "+ add1(2,3));
//console.log(add2(4,5));	// undefined

function add1(a,b) {
	return a+b;
}

var add2 = function(a,b){return a + b;}
console.log(add2(4,5));
//	add1 은 선언적 함수, add2는 익명함수
//	add2는 식별자에서 변수로 할당

add1 = 100;
console.log('add1 : ' + add1);
add1(3,5);

