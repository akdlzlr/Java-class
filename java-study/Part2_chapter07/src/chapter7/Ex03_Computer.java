package chapter7;

public class Ex03_Computer extends Ex03_Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 按眉狼 areaCircle() 角青");
		return Math.PI*r*r;
	}
//	@Override		// annotation
//	double areaCircle(double r) {
//		System.out.println("Computer 按眉狼 areaCircle() 角青");
//		return Math.PI*r*r;
//	}
}