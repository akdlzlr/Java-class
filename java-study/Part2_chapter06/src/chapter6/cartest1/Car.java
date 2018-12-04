package chapter6.cartest1;

public class Car {

	String company = "����ڵ���";
	String model = "K9";
	String color = "������";
	int maxSpeed = 300;
		
	public Car() {          // Source -> Generate Constructor using field
		
	}
	
	public Car(String company) {
		this(company,"K9","������",300);
	}
	
	public Car(String company, String model) {
		this(company,model,"������",300);
	}

	public Car(String company, String model, String color) {
		this(company,model,color,300);
	}

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}	
	
}