
function Student(name, korean, math, english, science){
	this.name = name;
	this.korean = korean;
	this.math = math;
	this.english = english;
	this.science = science;
	this.test = function test(){this.test=function(){console.log("테스트입니다");}};
}

Student.prototype.getSum= function(){
	return this.korean + this.math + this. english + this.science;
}

Student.prototype.getAverage = function(){
	return this.getSum()/4;
}

Student.prototype.toString = function(){
	return this.name + '\t' + this.getSum() + '\t' + this.getAverage();
}

var student = new Student('홍길동',10,10,20,20);
var student2 = new Student('홍길동',10,10,20,20);

//console.log(student);
console.log(student.toString());
student.test.test;

var obj={};
console.log(obj.toString());