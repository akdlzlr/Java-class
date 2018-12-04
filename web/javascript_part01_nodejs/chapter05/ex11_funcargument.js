var add = function(a,b){
	return a+b;
}
var multi = function(a,b){
	return a*b;
}
function calc(a,b,f){
	return f(a,b);
}

function process(f){
	f();
}

console.log(calc(add(2,3),multi(2,3),add));
console.log(calc(add(add(2,3),add(2,3)),multi(2,3),add));

process(add);
