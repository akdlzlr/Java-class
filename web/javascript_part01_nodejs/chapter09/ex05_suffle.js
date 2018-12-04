
function random(range, start=0){
	return Math.floor(Math.random()*range+start);
}

//function swap(a,b){
//	var temp = a;
//	a=b;
//	b=temp;
//}

Array.prototype.shuffle = function(){
	
	var arr = this.slice(0);
	
	for(var i =0; i<arr.length-1;i++){
		var ix = random(arr.length-(i+1));
		var temp=arr[ix];
		arr[ix]=arr[(arr.length-i-1)];
		arr[(arr.length-i-1)]=temp;	
//		swap(arr[ix],arr[(arr.length-i-1)]);
	}
	return arr;
}

Array.prototype.range = function(start,end){
	for(var i=start;i<end;i++){
		this.push(i);
	}
	return this;
}

var orgin = [].range(0, 48);
var deck = orgin.shuffle();

var p1 = deck.splice(0,7);
var p2 = deck.splice(0,7);
var p3 = deck.splice(0,7);
var bottom = deck.splice(0,6);

console.log(p1);
console.log(p2);
console.log(p3);
console.log(bottom);
console.log(deck.length);

var images = [].range(0,48)
				.map(v=>`card${v}.jpg`);
console.log(images);

bottom.forEach(v=>console.log(images[v]));