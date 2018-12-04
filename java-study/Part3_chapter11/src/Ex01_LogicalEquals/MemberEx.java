package Ex01_LogicalEquals;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)){
			System.out.println("1과2는 동등함");
		}else {
			System.out.println("동등하지않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("1과 3은 동등함");
		}else {
			System.out.println("동등하지않음");
		}
		
		System.out.println(obj1.hashCode());	//참조값 즉 메모리 주소...
		System.out.println(obj2.hashCode());	//object의 기본 해싱코드
		System.out.println(obj3.hashCode());	//10진수로 표현됨
		
		System.out.println(obj1);				//16진수로 표현한 메모리주소(참조값)
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
