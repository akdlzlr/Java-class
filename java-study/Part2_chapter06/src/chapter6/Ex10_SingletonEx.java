package chapter6;

public class Ex10_SingletonEx {
	public static void main(String[] args) {
		
		Ex10_Singleton obj1 = Ex10_Singleton.getInstance();
		Ex10_Singleton obj2 = obj1;
		
		obj1.greet("±Ë¿ØΩ≈");
		int a = obj2.num();
		System.out.println(a);
	}
}