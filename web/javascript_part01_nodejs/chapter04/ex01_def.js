
function test(a,b){
	a = a||10;
//	매개변수의 디폴트값 처리함
	console.log(a);
	console.log(b);
//	없으면 undefined!
}

test(20);
test('abc');
test();

test('abc',20);
test('asd',20,30);
//	30은 그냥 버림 ㅋㅋㅋ