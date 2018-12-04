
function add(a,b){
	return a+b;
};

var add2 = function(a,b){
	return a+b;
};

var add3 = (a,b)=>{		//	java ->
	return a+b;
};
//	화살표 함수라고도 한다.

//	한 줄인 경우
var add4 = (a,b)=> a+b;

console.log(add(4,5));

//	매겨변수가 하나일 경우
var prn = a=>console.log(a);
prn('hello');

//	매겨변수가 없을 경우는 ()를 해야함
var prn2 = ()=>console.log();
prn2();

prn('hello');


//	화살표 함수는 함수를 매개변수로 넘길 때 많이 사용한다.