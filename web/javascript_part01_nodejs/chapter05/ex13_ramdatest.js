
function calc(a,b,f){
	return f(a,b);
}


//	익명 함수로 호출하기
console.log("2 + 3 = "+calc(2,3, function(a,b){
	return a+b;
}));

console.log("2 * 3 = "+calc(2,3,function(a,b){
	return a*b;
}));
console.log();
//	람다로 호출하기
console.log("2 + 3 = "+calc(2,3,(a,b)=>a+b));
console.log("2 * 3 = " + calc(2,3,(a,b)=>a*b));
console.log();

calc(2,3, console.log);



//	보통 매개변수에서 함수를 받을 때 제일 뒤에 배치시킨다.



