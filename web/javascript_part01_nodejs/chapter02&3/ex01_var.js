'use strict'

var a = 12;
var b = 'korean';
console.log(a);
console.log(b);
console.log(a,b);
console.log(b,a);

a=b;
console.log(a,b);
// 'use strict'가 선언 없이 사용하는 변수에 대해 예외를 발생시킴
c = 13;
console.log(c);