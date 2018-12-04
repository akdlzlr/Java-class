var name = '고길동';

var person = {
		name: '홍길동',
		eat : function(food){
			console.log(this.name + '이 '+food+' 을/를 먹습니다.');
//			console.log(name + '이 '+food+' 을/를 먹습니다.');
		}
}

person.eat('pizza');


//////////////////////////////////////////////////////////////////////

var fn = person.eat;
//	익명함수를 바로 참조함 => this가 존재하지 않는다.
fn('피자');

setInterval(function (){
	person.eat('pizza')
},1000);


setInterval(person.eat,1000);

