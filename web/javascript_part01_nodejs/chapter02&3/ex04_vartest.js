//	변수 선언 오류 막는 법

//	첫번째 방법 : use strict로 c를 막음
//	'use strict'
//	두번째 방법 : 변수를 모두 맨 앞에 선언한다.
//	var c=0; d=0;

//	선언하고 초기화 하지 않은 변수 읽기
console.log(d);
var d=10;
console.log(d);

//	선언하지 않은 변수 읽기
//	console.log(c); 

//	선언하지 않은 변수 쓰기
c=12;
//	식별자 확인(poisting) 때 c는 검사되지 않음
console.log(c);