package Ex05_ThrowsEx;

public class ThrowsEx {
	public static void main(String[] args)  {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}