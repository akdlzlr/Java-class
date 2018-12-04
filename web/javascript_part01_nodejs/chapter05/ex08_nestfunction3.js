
console.log("a = "+a);
//	console.log(c); 
/*	c가 전역 변수이지만 inner()함수가 호출 된 후 할당됨
 	식별자 검사에서 발견 되지 않음*/

outer();

var a = 23;
var fn;
console.log("a = "+a);
console.log(c);
fn();

function outer(){
	var outvalue = 5678;
	function inner(){
		var invalue = 1234;
		console.log("outvalue = "+ outvalue);
		c=100;	// 전역변수
	}
	fn=inner;
	inner();
//	console.log(invalue);
//	선언 하지 않은 변수 읽기 에러 발생
}