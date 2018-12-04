package chapter5;
//call by reference 원본이 바뀜, 리턴값을 2개 이상 받고 싶을 때 사용할 수 있다.
public class Ex01_SwapEx2 {
	public static void swap(int[] arr) {
		int t= arr[0];
		arr[0]=arr[1];
		arr[1]=t;
		// 윗부분은 주소를 가지고 연산하여 힙영역의 데이터가 교환이 이루어짐
		System.out.println("호출 중 :"+arr[0]+","+arr[1]);
	}
		
	public static void main(String[] args) {  
		int []arr= {10,20};
		
		System.out.println("호출 전 :"+arr[0]+","+arr[1]);
		swap(arr);					// 힙 영역의 주소값이 매개변수로 넘어감
		System.out.println("호출 후 :"+arr[0]+","+arr[1]);
		//공통으로 사용하는 힙의 데이터를 건드려 main 메서드에 있는 값도 바뀜
	} 
}
// 스왑이 main 매서드에서도 이루어짐, 주소(참조값)을 넘긴것