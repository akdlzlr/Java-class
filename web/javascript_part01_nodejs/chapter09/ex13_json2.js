
var human = {
		name: "김상형",
		age: 29
};

var json = JSON.stringify(human);
console.log(json+"</br />");

var human2 = JSON.parse(json);
console.log(human2.name);
console.log(human2.age);
