
function outer(){
	return function(){
		console.log('hello function...?');
	}
}


outer()();

var fn = outer();
fn();