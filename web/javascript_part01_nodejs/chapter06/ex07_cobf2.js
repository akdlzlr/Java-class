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


var students = [];

var map = {};	// 객체 생성

for(var ix = 0; ix<25; ix++){
	var s,name;
	if(ix%2==0){
		name = '고길동_'+ix;
	}else{
		name = '홍길동_'+ix;
	}
	s=makeStudent(name,90-ix,83-ix,76-ix,89-ix);
	students.push(s);
	
	map[name] = s;	//이름을 속성명으로, 객체를 속성 값으로 저장~
//	필드명 = 고길동_0 : value,
}
//	console.log(map);


function search(name){
	for(var i in students){
		if(name==students[i].name){		// java에서는 .equals로 비교해야함
			return students[i];
		}
		//	return 값이 없을 때 undefined가 넘어감, java에선 리턴값이 없으면 에러
	}
}

var name="고길동_12";

//var std= search(name);
//console.log(std);

var std = map[name];
console.log(std);


//for ( var i in students) {
//	 console.log(students[i].toString());
//}

