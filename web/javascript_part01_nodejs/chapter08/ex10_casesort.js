var country = ["korea","USA","Japan","china", "Peru"];

function compareIgnoreCase(left,right){
	var left2 = left.toLowerCase();
	var right2 = right.toLowerCase();
	if(left2<right2) return 1;
	if(left2>right2) return -1;
	return 0;
}



console.log(country);

country.sort();

console.log(country);

country.sort(compareIgnoreCase);

console.log(country);