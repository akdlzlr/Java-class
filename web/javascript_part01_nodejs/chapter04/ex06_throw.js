function func(){
	if(true) throw "예외가 발생";	
}

try{
	func();
} catch(exception){
	console.error("이름 : "+exception.name+
			"\n 메시지 : "+exception.message+
			"\n설명 : "+exception.description);
	console.error(exception);
}
console.log("실행 완료");
