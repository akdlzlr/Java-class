package chapter3;
import lib.Random; 

public class Test1_012 {	
	public static String toString(int n) {
		String[] arr1= {"가위","바위","보"};
		return arr1[n];		
//		if(n==0) {
//			return "가위";
//		}else if(n==1) {
//			return "바위";
//		}else if(n==2){
//			return "보";
//		}else {
//			return "x";
//		}
	}	
	public static void main(String[] args) throws Exception {
		int keyCode=0;
		int me,com;
			
//		while(true) {
//			if(keyCode !=13 &&keyCode!=10) {
//				System.out.println("0 : 가위, 1 : 바위, "
//										+ "2 : 보, 3 : 종료");
//				System.out.print("선택 : ");
//				}else if(keyCode ==13 ||keyCode==10) {
//					continue;
//				}
	
			keyCode = System.in.read();
			me = keyCode-'0';
			// 코드의 순서를 이용하여 뺄셈으로 한번에 표현
			System.out.println(keyCode);
			if(keyCode==51) {
				System.out.println("종료합니다.");
//				break;
			}
			com=Random.rand(0, 3);
		
			System.out.println("나 : "+toString(me)+","
									+ " com : "+toString(com));
		
			if(me == com) {
				System.out.println("비겼습니다.");
			}else if((me==0&&com==1)||(me==1 && com==2)
											||(me==2 && com==0)) {
				System.out.println("졌습니다.");
			}else if((me==0&&com==2)||(me==1&&com==0)||(me==2&&com==1)) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("잘못입력한듯...");
//				break;
//			}
		}
	}
}