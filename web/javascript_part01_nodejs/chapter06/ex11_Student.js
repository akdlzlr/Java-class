class Student{
	constructor(name,age){
		this._name = name;
		this.age = age;
	}
	
	printProfile(){
		console.log(`이름 : ${this.name}, 나이 : ${this.age}`);
	}
	
	get name(){
		return this._name;
	}
	
	set name(name){
		this._name=name;
	}
}

var s1 = new Student("홍길동",23);
//console.log(s1.name);

s1.printProfile();

console.log(s1);
console.log("printProfile" in s1.__proto__);	//	인스턴스를 통해 접근할때
console.log("printProfile" in Student.prototype);	//	함수로 접근할때



var s2=new Student("홍길동",22);
console.log(s2.name);
s2.name='고길동';
console.log(s2.name);
console.log(s2);