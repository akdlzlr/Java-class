var items = ["100선","지역별","일정잡기"];

var str="<ul>\n";
for(var value of items){
	str+=`	<li>${value}<li>\n`;	
}
str += '</ul>';
console.log(str);

var result = "<table>\n";
for(var value in items){
	result+=`	<tr><td>${value}</td><td>${items[value]}</td></tr>\n`;
}
result +='</table>';
console.log(result);
