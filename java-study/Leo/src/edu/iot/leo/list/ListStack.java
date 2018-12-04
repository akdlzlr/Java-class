package edu.iot.leo.list;

public class ListStack {
	
	
//	ObjList에 위임하여 스택 만들기
//	코드재사용 기법 중 하나이다. 상속, 위임
//	매서드에서 직접 처리하지 않고 ObjLIst의 매서드에 위임시킴
	
//	필드
	ObjList data;
		
//	생성자
	public ListStack(){
		data = new ObjArrayList(10);
	}
	
	public ListStack(int size) {
		data = new ObjArrayList(size);
	}

//	메서드
	public void push(Object obj) {
		data.add(obj);
	}
	
	public Object pop() {
		return data.remove(data.size()-1);
	}
}