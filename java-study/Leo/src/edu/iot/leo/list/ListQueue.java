package edu.iot.leo.list;

public class ListQueue {
	
//	ObjList�� �̿��Ͽ� ť �����
	
//	�ʵ�
	ObjList data;
	
//	������
	public ListQueue() {
		data = new ObjArrayList();
	}
	public ListQueue(int size) {
		data = new ObjArrayList(size);
	}
	
//	�޼���
	public void enqueue(Object obj) {
		data.add(obj);
	}
	public Object dequeue() {
		return data.remove(0);
	}
}
