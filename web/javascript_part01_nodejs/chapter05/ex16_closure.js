
function test(name){
	var output=`hello ${name}...!`;
	
	return function(){
		console.log(output);
		console.log(name);
	}
}

test('javascript')();

var fn = test('javascript2');

fn();
fn();

var fn2 = test('javascript3');
fn2();
fn2();

