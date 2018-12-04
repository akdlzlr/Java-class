var global = "전역";

function func() {
	var local = "로컬";
	console.log("함수안 local = "+local);
	console.log("함수안 global = "+global);
}

func();

// console.log("함수밖 local = "+local);
// 인터프린터의 특징 = 오류를 실행해야만 알 수 있다.
console.log("함수밖 global = "+global);