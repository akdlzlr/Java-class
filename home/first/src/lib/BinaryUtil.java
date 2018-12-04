package lib;

public class BinaryUtil {

	public static String toBinaryString(int value) {
		String a = Integer.toBinaryString(value);
		while(a.length()<32) {
			a="0"+a;
		}
		return a;
	}
	
	public static void printBinary(int v) {
		System.out.println(toBinaryString(v)+
				"(½ÊÁø¼ö : "+v+")");
	}	
}