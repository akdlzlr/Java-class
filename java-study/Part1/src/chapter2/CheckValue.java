package chapter2;

public class CheckValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 129;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�Ҽ� ����.");
			System.out.println("���� �Ѱ谪�� �ʰ��Ͽ���.");
		}else {
			byte b= (byte)i;
			System.out.println(b);
		}
	}
}