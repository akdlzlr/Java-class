package edu.iot.leo.list;

public class ListQueue {
	
//	ObjList를 이용하여 큐 만들기
	
//	필드
	ObjList data;
	
//	생성자
	public ListQueue() {
		data = new ObjArrayList();
	}
	public ListQueue(int size) {
		data = new ObjArrayList(size);
	}
	
//	메서드
	public void enqueue(Object obj) {
		data.add(obj);
	}
	public Object dequeue() {
		return data.remove(0);
	}
}
