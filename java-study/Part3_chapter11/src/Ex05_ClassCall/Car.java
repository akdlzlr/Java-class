package Ex05_ClassCall;

public class Car {
//	내용은 없는 클래스를 만듬
//	메인에서 클래스에서 로더할 클래스임
	
//	내용 추가
//	필드
	private String model;
	public String owner;
//	생성자
	public Car() {
		super();
	}
	
	public Car(String model, String owner) {
		super();
		this.model = model;
		this.owner = owner;
	}
//	메서드  getter, setter
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
