package chapter2;

public class Operations {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		/* byte intValue1 = byteValue1 + byteValue2; 
		   ���� ������� int���� ������ ���� �߻�*/
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		/* char intValue2 = charValue1 + charValue2;
		   ���� ������� int���� ������ ���� �߻�*/
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�="+intValue2);
		System.out.println("��¹���="+(char)intValue2);
		
		char charValue3 = (char)(charValue1+charValue2);
		System.out.println("��¹���="+charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
		
		double doubleValue2=intValue5/4;
		System.out.println(doubleValue2);
		}
}