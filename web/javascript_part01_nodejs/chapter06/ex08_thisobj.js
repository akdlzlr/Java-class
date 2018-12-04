function Student(name, korean, math, english, science){
	this.name = name;
	this.korean = korean;
	this.math = math;
	this.english = english;
	this.science = science;
	
	this.getSum= function(){
		return this.korean + this.math + this.english + this.science;
	};
	
	this.getAverage = function(){
		return this.getSum()/4;
	};
	
	this.toString = function(){
		return this.name + '\t'+ this.getSum() + '\t'+this.getAverage();
	}
}


/*
var student = new Student('김세진', 90, 83, 76, 89);
//	new 연산자의 역할 = {}, 비어있는 객체를 만듬
//	이후 Student 함수를 통해 값이 추가됨
//	즉, student는 new 연산자에 의해 생성된 객체를 리턴 받음
console.log(student);
console.log(this);

var student = Student('홍길동', 90, 83, 76, 89);
//	여기서 this는. top level을 가리킴, 즉 전역변수로 name이 생성.
//	웹브라우저에서는 top level는 window를 뜻함.
//	this. 를 잘 생각해야함, 즉 student는 리턴 받는게 없음 => undefined
console.log(student);
console.log(name);
console.log(this);
*/

var students=[];
for(var i=0;i<25;i++){
	students.push(new Student('홍길동_'+i,90,83,76,89));
}

console.log(students);


