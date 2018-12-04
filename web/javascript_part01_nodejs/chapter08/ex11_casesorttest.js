function makeStudent(name, korean, math, english, science) {
	var student = {
		name : name,
		korean : korean,
		math : math,
		english : english,
		science : science,

		getSum : function() {
			return this.korean + this.math + this.english + this.science;
		},

		getAverage : function() {
			return this.getSum() / 4;
		},

		toString : function() {
			return this.name + '\t' + this.getSum() + '\t' + this.getAverage();
		}
	};
	return student;
}

function search(name){
	for(var i in students){
		if(name==students[i].name){	
			return students[i];
		}
	}
}

function compareByName(std1,std2){
	if(std1.name>std2.name){return 1;}
	if(std1.name<std2.name){return -1;}
	return 0;
}

function compareByAvg(std1, std2){
	return std1.getAverage() - std2.getAverage();
}

var students = [];
var map = {};	// 객체 생성
var name="고길동_12";
var std = map[name];


for(var ix = 0; ix<25; ix++){
	var s,name;
	if(ix%2==0){
		name = '고길동_'+ix;
	}else{
		name = '홍길동_'+ix;
	}
	s=makeStudent(name,90-ix,83-ix,76-ix,89-ix);
	students.push(s);
	
	map[name] = s;
}

console.log(std);
//
//students.sort(compareByName);
//console.log(students);
students.sort(compareByAvg);
console.log(students);

