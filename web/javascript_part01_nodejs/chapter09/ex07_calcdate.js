Date.prototype.dateFormat = function(){
	var year = this.getFullYear();
	var month = this.getMonth()+1;
	var date = this.getDate();
	
	month = (month<10)?'0'+month : month;
	date = (date<10)? '0'+date : date;
	
	return `${year}-${month}-${date}`;
	
}

var now = new Date();
var epoch = now.getTime();

epoch +=(86400*1000*3);

now.setTime(epoch);
console.log("사흘 후는 " + now.dateFormat()+" 입니다.");