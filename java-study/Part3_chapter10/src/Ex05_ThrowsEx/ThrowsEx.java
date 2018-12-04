package Ex05_ThrowsEx;

public class ThrowsEx {
	public static void main(String[] args)  {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}