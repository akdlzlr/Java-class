function check(){

	if(isNaN(document.frm.age.value)){
		alert("나이는 숫자");
		document.frm.age.focus();
		return false;
	}
}