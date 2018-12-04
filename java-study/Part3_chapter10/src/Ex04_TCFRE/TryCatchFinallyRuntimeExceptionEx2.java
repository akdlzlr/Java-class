package Ex04_TCFRE;

public class TryCatchFinallyRuntimeExceptionEx2 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
//		다중 예외처리
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(data1+" + "+data2+" = "+result);
			return;		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족 ");
			System.out.println("[실행 방법]");
			System.out.println("java Try-------------- num1 num2");
			return;
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없는데...?");
		}finally {
			System.out.println("다시해봐!!!");
		}
	}
}
