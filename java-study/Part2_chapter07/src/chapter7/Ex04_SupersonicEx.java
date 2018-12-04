package chapter7;

public class Ex04_SupersonicEx {
	public static void main(String[] args) {
		Ex04_Supersonic sa = new Ex04_Supersonic();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = Ex04_Supersonic.SUPERSONIC;
		sa.fly();
		
//		sa.flyMode = Ex04_Supersonic.NORMAL;
//		sa.fly();
		
//		sa.land();
	}
}
