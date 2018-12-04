package chapter7;

public class Ex03_ComputerEx {
	public static void main(String[] args) {

		int r = 10;
		
		Ex03_Calculator calculator = new Ex03_Calculator();
		System.out.println("원면적 : "+calculator.areaCircle(r));
		
		
		Ex03_Computer computer = new Ex03_Computer();
		
		System.out.println("원면적 : "+computer.areaCircle(r));
	

	}
	
}
