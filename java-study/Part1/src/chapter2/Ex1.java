package chapter2;

public class Ex1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 70;
		int num3 = 80;
		
		double sum = (double)num1+num2+num3;
		System.out.println("sum = "+ sum);
		
		double avg = (num1+num2+num3)/3.;
		//double avg = (double)(num1+num2+num3)/3;
		System.out.println("avg = "+ avg);
	}
}