package Ex07_StringClass;

public class StringWithEx {
	public static void main(String[] args) {
		String str = "OverAction.app";
	
		String testStr = str.toLowerCase();		// �񱳸� ���� �ҹ��� �Ǵ� �빮�ڷ� ����
		
		if(testStr.endsWith("app")) {
			System.out.println(str);
		}else {
			System.out.println("Ȯ���ڰ� �ٸ��ϴ�.");
		}
		
		
	}
}
