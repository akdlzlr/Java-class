function Rectangle(w,h){
	var width = w;
	var height = h;
//	width와 height는 Rectangle의 private 값으로 볼수 있다.
	
	this.getWidth = function(){ return width;};
	this.getHeight = function(){return height;};
	this.setWidth = function(w){width=w;};
	this.setHeight = function(h){height=h;}
}
Rectangle.prototype.getArea = function(){
	return this.getWidth()*this.getHeight();
};


function Square(length){
	this.base = Rectangle;
	this.base(length,length);
}

Square.prototype = Rectangle.prototype;
//	받아온 Rectangle.prototype의 구조를 Square 구조로 바꿈
Square.prototype.constructor = Square;

var rectangle = new Rectangle(5,7);
console.log(rectangle.getArea());

var square = new Square(5);
console.log(square.getArea());

