package chapter5;

public class Ex04_ArrayCreate {
	public static void main(String[] args) {
		System.out.println(args.length); //메인 메서드를 호출하는 jvm이 매개변수를 설정.
		int[] arr1 = new int[3];
		// 참조타입으로 변수이름과 크기를 포함하여 선언할 경우 기본타입은 0으로 자동 초기화
		for(int i=0;i<3;i++) {
			System.out.println("arr1 ["+i+"] : "+arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0;i<3;i++) {
			System.out.println("arr1 ["+i+"] : "+arr1[i]);
		}
		System.out.println("====================");
		
		double[] arr2 = new double[6];
		// 참조타입으로 변수이름과 크기를 포함하여 선언할 경우 기본타입은 0으로 자동 초기화
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2 ["+i+"] : "+arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		arr2[3] = 0.4;
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2 ["+i+"] : "+arr2[i]);
		}
		System.out.println("====================");
		
		String[] arr3 = new String[3];
		// 참조타입으로 변수이름과 크기를 포함하여 선언할 경우 참조타입은 null로 자동 초기화
		for(int i=0;i<3;i++) {
			System.out.println("arr3 ["+i+"] : "+arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0;i<3;i++) {
			System.out.println("arr3 ["+i+"] : "+arr3[i]);
		}
		System.out.println("====================");
		
		String[] arr4 = {"1월","2월","3월"}; //선언과 동시에 초기화하기
		String[] arr5 = {"1월","2월","3월"};
		for(int i=0;i<3;i++) {
			System.out.println("arr4 ["+i+"] : "+arr4[i]);
		}
		if (arr4==arr5) {
			System.out.println("strVar3과 strVar4 참조가 같음");
		}
	}
}
