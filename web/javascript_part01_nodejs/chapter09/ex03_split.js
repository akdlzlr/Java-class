var citys = "서울,부산,대전,광주,서울,부산,대전,광주";
var parts = citys.split(",");
for(var city in parts){
	console.log("도시명 : "+parts[city]);
}

console.log(parts);

//	중복 제거하기
var set = {};
for(var city of parts){
	if(set[city]){
		set[city]++;
//		두번째부터 true 
	}else {
		set[city]=1;
//		첫번째 서울은 undefined => false
	}
}
console.log(set);
console.log(Object.keys(set));