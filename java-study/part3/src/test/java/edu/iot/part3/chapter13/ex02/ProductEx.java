package edu.iot.part3.chapter13.ex02;

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>(); // 사용할 타입 선언
		product1.setKind(new Tv());			// Tv 클래스를 타입으로
		product1.setModel("스마트 TV");
		Tv tv = product1.getKind();
		String tvModel1 = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>(); // 사용할 타입 선언
		product2.setKind(new Car());		// Car 클래스를 타입으로
		product2.setModel("디젤");
		String carModel1 = product2.getModel();
		
		System.out.println(product1);
		System.out.println(product2);
	}
}