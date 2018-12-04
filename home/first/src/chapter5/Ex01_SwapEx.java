package chapter5;
//Call by value 원본이 유지 됨
public class Ex01_SwapEx {
	
	public static void swap(int a, int b) {
		int t = a;
		a=b;
		b=t;
		System.out.println("호출 중 :"+a+","+b);
	}
		
	public static void main(String[] args) {  //얘도 지역변수
		int a =10;
		int b =20;
		
		System.out.println("호출 전 :"+a+","+b);
		swap(a,b); // call by value : 매개변수로 전달
		//기본 타입은 그대로 복사되므로 원래 메소드의 값은 변하지 않는다?????
		System.out.println("호출 후 :"+a+","+b);
	}   // 지역변수 총 3개 a,b,main(args) 
}
// 스왑이 swap 매서드에서만 됨, 복사본이 넘어간것