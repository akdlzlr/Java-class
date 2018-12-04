
var str = "test s123 s-45 s67M S-8m s-123M s-superTM";
var reg = new RegExp("[sS]-[0-9]*T?M");
//		= /[sS]-[0-9]*T?M/;

var result = reg.exec(str);
var result2 = str.search(/[sS]-[0-9]*T?M/);

console.log(result);
console.log();
console.log(result2);