//	랜덤
console.log(Math.floor(Math.random()*10+1));
console.log(Math.round(Math.random()*10));

console.log("===========================================");
console.log(random(10));

function random(range, start=0){
	return Math.floor(Math.random()*range+start);
}

Number.prototype.forEach = function(f){
	for(var i=0; i<this;i++){
		f(i);
	}
}

//(10).forEach(function(i){
//	console.log(i);
//});

console.log(Math.log10(12345));

function formatSize(bytes, dm=2){
	if(bytes ==0) return '0B';
	var k =1000,
//		dm = decimalPoint || 2,
//			 decimalPoint가 0일 때, 뒤에 2가 들어간다? 오동작?
		sizes = ['B','K','M','G', 'T'],
		i=Math.floor(Math.log10(bytes)/Math.log10(k));
	return parseFloat((bytes/Math.pow(k,i)).toFixed(dm))+sizes[i];
}

console.log(formatSize(123456,0));