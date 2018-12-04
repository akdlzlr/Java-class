

function foreach(arr,fn){
	for(var i = 0; i < arr.length; i++){
		fn(arr[i], i, arr);
	}
}

var data = [10,20,30,40,50,60,70,80];

//foreach(data, console.log);
console.log();

//foreach(data, function(item){
//	console.log(item);
//})
console.log();

//foreach(data, (item)=>console.log(item));

/////////////////////////////////////////////////////

var sum=0;
//foreach(data,(item)=> sum+=item);
console.log(sum);

/////////////////////////////////////////////////////
data.forEach(item=>sum+=item);
console.log('합계',sum);


////////////////////////////////////////////////////

console.log('최대값',Math.max(...data));
console.log('최소값',Math.min(...data));

var str = "<ul>\n";
data.forEach(function(num){
	str +=`	<li>${num}</li>\n`;
})




//	foreach(data,(item)=>str+=`	<li>${item}</li>\n`);
str +="</ul>"
	
console.log(str);





//	`` 템플릿 문자열을 사용하면 문자열의 결합이 아닌 한 문장으로 처리 할 수 있어서
//	더 좋고 문자열의 결합보다 가독성과 쓰기가 더 좋다.
//	성능은 차이 음슴