var score = [82,96,54,64,87,20];

console.log(score);

function compare(left,right){
	return right - left;
}

score.sort(compare);
console.log("after = "+score);

// 익명구현객체와 람다식
/*	score.sort(function compare(left,right){
	return right - left;
	})		*/

/*	score.sort((left,right)=> right-left)		*/
