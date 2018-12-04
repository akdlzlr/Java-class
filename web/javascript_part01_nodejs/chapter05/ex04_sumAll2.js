function sumAll(...arr){
	var sum = 0;
	
	for(var i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	return sum;
}

console.log(sumAll(1,2,3,4));

var arr = [1,2,3,4];

console.log(sumAll(arr)); // 이상한 값 나옴
console.log(sumAll(...arr)); // 배열을 펼쳐서 넣어라


