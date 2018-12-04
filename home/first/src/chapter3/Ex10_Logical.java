package chapter3;

public class Ex10_Logical {

	public static char toLower(char charCode) {
		int ch=charCode;
		if((charCode>=65)&&(charCode<=90)) {
			ch = charCode+32;
		}
		return (char)ch;
	}
	public static void main(String[] args) {
		char charCode = 'A';
		charCode = toLower(charCode);
		System.out.println(charCode);
	}
}

//	public static void charChange(char charCode) {
//		if((charCode>=65)&&(charCode<=90)) {
//			System.out.println("대문자네");
//			int charChange = charCode+32;
//			System.out.println("소문자로 바꿈 : "+(char)charChange);
//			System.out.println();
//		}else {
//			System.out.println("소문자네 : "+(char)charCode);
//		    System.out.println();
//		}
//	}
//		
//	public static void main(String[] args) {
//		charChange('B');
//		charChange('a');	
//	}
//}

