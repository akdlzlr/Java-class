package chapter5;

public class Ex03_ArrayCreate {
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//int[] scores = {83,90,87};
		
		int[] scores;
		scores = new int[] {83,90,87};
		
		int sum1=0;
//		
//		for(int i=0;i<3;i++) {
//			System.out.println("scores["+i+"] : "+scores[i]);
//		}
						
		sum1=add(scores);
		System.out.println("ÃÑÇÕ : "+sum1);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("ÃÑÇÕ : "+sum2);
//		double avg = (double)sum2/3;
//		float avg1 = (float)sum2/3;
//		System.out.println("Æò±Õ : "+avg);
	}
}