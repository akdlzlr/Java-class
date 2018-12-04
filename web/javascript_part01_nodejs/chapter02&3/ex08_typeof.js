

console.log(typeof 52);
console.log(typeof (typeof 52));
//	숫자 52의 타입은 넘버, typeof의 리턴값 52는 문자열

var a;
var type = typeof(a);
console.log(type);
a=12;

type=typeof(a);
console.log(type);

var b;
if(b==undefined){
	console.log('초기화가 되지 않았습니다.');
}

if(typeof b == 'undefined'){
	console.log('초기화가 되지 않았습니다.')
}

console.log(typeof function(){});
console.log(typeof {});

