


var arr=[1,2,3,4];

function process(f){
	for(var value of arr){
		f(value)
	}
}

function fs(v){
	console.log(v*v);
}

process(console.log);
process(fs);

// 전략 패턴!!!
// 전달된 코드에 의해서 결정됨