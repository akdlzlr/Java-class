package chapter6;

public class Ex04_CalculatorEx {
	public static void main(String[] args) {

		Ex04_CalculatorMatod myCal = new Ex04_CalculatorMatod();

		if (!myCal.isPowerOn()) {		//필드를 외부에서 직접사용하는 것은 안좋다.
			myCal.powerOn();
		}

//		int result1 = myCal.plus(5, 10);
//		System.out.println("5 + 10 = " + result1);
//
//		byte x = 10;
//		byte y = 5;
//		double result2 = myCal.divide(x, y);
//		System.out.println(x + " / " + y + " : " + result2);
//		
//		System.out.println("한변의 길이가 2인 정사각형의 넓이 : "+myCal.areaRectangle(2));
//		System.out.println("변의 길이가 2, 4인 직사각형의 넓이 : "+myCal.areaRectangle(2, 4));
		
		System.out.println("2+3 = "+myCal.plus(2, 3));
		System.out.println("+7 = "+myCal.plus(7));
		System.out.println("+5 = "+myCal.plus(5));
		System.out.println("+3 = "+myCal.plus(3));
		System.out.println("/2 = "+myCal.divide(2));
		myCal.clear();
		
		myCal.powerOff();
	}
}