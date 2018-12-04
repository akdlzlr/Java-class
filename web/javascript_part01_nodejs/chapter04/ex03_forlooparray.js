

var arScore = [88, 78,, 96, 54, 23];

for (var st=0;st<arScore.length;st++){
	console.log(st+"번째 학생의 성적 :"+arScore[st]);
}
console.log();

//arScore.length=10;
//for (var st=0;st<arScore.length;st++){
//	console.log(st+"번째 학생의 성적 :"+arScore[st]);
//}
//
//console.log();
//arScore.length=3;
//for (var st=0;st<arScore.length;st++){
//	console.log(st+"번째 학생의 성적 :"+arScore[st]);
//}

console.log(arScore[-1]);



var arr = [];
arr.length = 100;


for(var i in arScore){
	console.log(i, arScore[i]);
}
//	값이 없는것은 건너 뜀 = 인덱스(key)도 없다.
//	인덱스가 넘어옴

for(var value of arScore){
	console.log(value);
}
//	실제 값이 넘어옴
//	undefined라는 값이 넘어옴

