var now = new Date();
//	표준시
console.log(now);
//	컴퓨터에 맞는 시간
console.log(now.toString());
//	컴퓨터에 맞는 시간 + 그 지역에 맞는 시간타입
console.log(now.toLocaleDateString());
console.log(now.toLocaleTimeString());
console.log(now.toLocaleString());


//	직접 만들기
console.log("현재시간은 "+
		now.getFullYear()+"년 "+
		(now.getMonth()+1)+"월 "+
		now.getDate()+"일 "+
		now.getHours()+":"+now.getMinutes()+
		"입니다.");

Date.prototype.dateFormat = function(){
	var year = this.getFullYear();
	var month = this.getMonth()+1;
	var date = this.getDate();
	
	month = (month<10)?'0'+month : month;
	date = (date<10)? '0'+date : date;
	
	return `${year}-${month}-${date}`;
	
}

Date.prototype.timeFormat = function(){
	var hour = this.getHours();
	var minutes = this.getMinutes();
	var sec = this.getSeconds();
	
	hour =(hour<10)?'0'+hour:hour;
	minutes = (minutes<10)?'0'+minutes:minutes;
	sec = (sec<10)?'0'+sec:sec;
	return `${hour}:${minutes}:${sec}`;
}
while(true){
	var now2 = new Date();
	console.log(now2.dateFormat());
	console.log(now2.timeFormat());
}