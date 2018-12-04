var score = [82,96,54,76,9,100,69,88];
var score2 = score
				.filter(value=>value>=80)
//				.sort()
				.sort((d1,d2)=>d1-d2)
				.map(value=> `	<li>${value}</li>`)
				.join('\n');

score2 = "<ul>\n"+score2+"\n</ul>";

console.log('score',score);
console.log(score2);

