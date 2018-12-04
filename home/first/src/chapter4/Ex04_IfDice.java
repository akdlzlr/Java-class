package chapter4;

public class Ex04_IfDice {
	public static void main(String[] args) {
		int num = (int) (Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1¹ø ³ª¿È");
		}else if(num==2) {
			System.out.println("2¹ø ³ª¿È");
		}else if(num==3) {
			System.out.println("3¹ø ³ª¿È");
		}else if(num==4) {
			System.out.println("4¹ø ³ª¿È");
		}else if(num==5) {
			System.out.println("5¹ø ³ª¿È");
		}else if(num==6) {
			System.out.println("6¹ø ³ª¿È");
		}else {
			System.out.println("Àß¸øµÈ °ªÀÌ ³ª¿È");
		}
	}
}
