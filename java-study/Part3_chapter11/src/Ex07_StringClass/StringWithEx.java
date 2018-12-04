package Ex07_StringClass;

public class StringWithEx {
	public static void main(String[] args) {
		String str = "OverAction.app";
	
		String testStr = str.toLowerCase();		// 비교를 위해 소문자 또는 대문자로 통일
		
		if(testStr.endsWith("app")) {
			System.out.println(str);
		}else {
			System.out.println("확장자가 다릅니다.");
		}
		
		
	}
}
