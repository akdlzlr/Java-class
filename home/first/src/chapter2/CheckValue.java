package chapter2;

public class CheckValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 129;
		
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할수 없다.");
			System.out.println("값이 한계값을 초과하였다.");
		}else {
			byte b= (byte)i;
			System.out.println(b);
		}
	}
}