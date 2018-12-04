package Ex03_TCFE;

public class TryCatchFinallyEx {
	public static void main(String[] args) {	
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}