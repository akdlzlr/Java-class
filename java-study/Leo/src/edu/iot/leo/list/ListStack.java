package edu.iot.leo.list;

public class ListStack {
	
	
//	ObjList�� �����Ͽ� ���� �����
//	�ڵ����� ��� �� �ϳ��̴�. ���, ����
//	�ż��忡�� ���� ó������ �ʰ� ObjLIst�� �ż��忡 ���ӽ�Ŵ
	
//	�ʵ�
	ObjList data;
		
//	������
	public ListStack(){
		data = new ObjArrayList(10);
	}
	
	public ListStack(int size) {
		data = new ObjArrayList(size);
	}

//	�޼���
	public void push(Object obj) {
		data.add(obj);
	}
	
	public Object pop() {
		return data.remove(data.size()-1);
	}
}