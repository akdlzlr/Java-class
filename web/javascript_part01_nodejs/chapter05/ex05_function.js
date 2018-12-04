function fn(){
	console.log('Hello javascript');
}

function process(f){
	f(10,20);
}

var fn2=fn;

fn();
fn2();

process(fn2);

process(console.log);
process(fn2);
//	java의 익명구현 객체와 비슷한 개념...
//	매개변수로 함수의 참조값을 넘긴다.