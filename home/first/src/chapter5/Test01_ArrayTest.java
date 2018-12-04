package chapter5;

public class Test01_ArrayTest {
	public static int Sum(int [] arr) {		//순회, 제일 많이 하는 작업이다
		int sum=0;
		for(int i=0;i<=9;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void printArray(int[] arr) {		//순회 매서드라고 한다.
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] scores = {80,88,78,45,90,68,45,74,62,50};	// 배열의 요소
		double avg;
		
		avg = Sum(scores)/10.;
		printArray(scores);
		System.out.println("합계 : "+Sum(scores)+", 평균 : "+avg);
	}
}