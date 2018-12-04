
test();
//	식별자를 확인하고 실행함, 즉 아래의 함수를 확인하고 실행 되므로 실행 가능

function test(){
	console.log("i = "+i+", k="+k);
//	오류발생 아님
//	스크립트가 실행 하기 앞서서 top 레벨에서 식별자 검사를 함.

	for (var i=0; i<3;i++){
		var k =1234;
		console.log("i = "+i);
	}
	
	for (let i=0; i<3;i++){
		var k =1234;
		console.log("i = "+i);
	}
	
	
// 함수단위로 나뉨
// 같은 블럭이 아니어도 사용가능
	
	console.log("i = "+i+", k="+k);
}

// console.log("i = "+i+", k="+k);
// 함수단위 지역이 달라 예외 발생