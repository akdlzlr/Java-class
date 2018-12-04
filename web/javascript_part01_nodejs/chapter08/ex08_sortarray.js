var score = [10,50,20,90,5,1];

console.log(score);

var arr = score.slice(0)
				.sort()
				.reverse();
console.log(arr);

console.log("========================================");

var arr2 = score.sort().slice(0);
console.log(score);
console.log(arr2);