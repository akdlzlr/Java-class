package Ex05_ClassCall;

public class Car {
//	������ ���� Ŭ������ ����
//	���ο��� Ŭ�������� �δ��� Ŭ������
	
//	���� �߰�
//	�ʵ�
	private String model;
	public String owner;
//	������
	public Car() {
		super();
	}
	
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}
//	�޼���  getter, setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
