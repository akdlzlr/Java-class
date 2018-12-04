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
students.push(makeStudent('홍길동', 90, 80, 70, 80));
students.push(makeStudent('고길동', 70, 70, 75, 85));
students.push(makeStudent('둘리', 60, 85, 75, 60));
students.push(makeStudent('또치', 80, 80, 80, 80));
students.push(makeStudent('도우너', 70, 70, 70, 70));
students.push(makeStudent('희동이', 40, 20, 40, 30));

var output = '이름\t총점\t평균\n';
for ( var i in students) {
	output += students[i].toString() + '\n';
}

//console.log(output);
var totalAvg=0;

var str = `
	<table border = "1" style="width:80%">
	<thead><tr>
		<th>이름</th><th>국어</th><th>영어</th>
		<th>수학</th><th>과학</th><th>평균</th>
	</tr></thead>
	<tbody>`;
for ( var i in students) {
	str += `
	<tr>
		<td>${students[i].name}</td>
		<td>${students[i].korean}</td>
		<td>${students[i].english}</td>
		<td>${students[i].math}</td>
		<td>${students[i].science}</td>
		<td>${students[i].getAverage()}</td>
	</tr>`;
	totalAvg +=students[i].getAverage();
}
var avg=(totalAvg/students.length).toFixed(2);
str +=`
	<tr>
		<td colspan="6" style="text-align:right">총 ${students.length}명, 평균 : ${avg}</td>
	</tr>
	</tbody>
</table>`;

console.log(str);








