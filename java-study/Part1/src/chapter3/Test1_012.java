package chapter3;
import lib.Random; 

public class Test1_012 {	
	public static String toString(int n) {
		String[] arr1= {"����","����","��"};
		return arr1[n];		
//		if(n==0) {
//			return "����";
//		}else if(n==1) {
//			return "����";
//		}else if(n==2){
//			return "��";
//		}else {
//			return "x";
//		}
	}	
	public static void main(String[] args) throws Exception {
		int keyCode=0;
		int me,com;
			
//		while(true) {
//			if(keyCode !=13 &&keyCode!=10) {
//				System.out.println("0 : ����, 1 : ����, "
//										+ "2 : ��, 3 : ����");
//				System.out.print("���� : ");
//				}else if(keyCode ==13 ||keyCode==10) {
//					continue;
//				}
	
			keyCode = System.in.read();
			me = keyCode-'0';
			// �ڵ��� ������ �̿��Ͽ� �������� �ѹ��� ǥ��
			System.out.println(keyCode);
			if(keyCode==51) {
				System.out.println("�����մϴ�.");
//				break;
			}
			com=Random.rand(0, 3);
		
			System.out.println("�� : "+toString(me)+","
									+ " com : "+toString(com));
		
			if(me == com) {
				System.out.println("�����ϴ�.");
			}else if((me==0&&com==1)||(me==1 && com==2)
											||(me==2 && com==0)) {
				System.out.println("�����ϴ�.");
			}else if((me==0&&com==2)||(me==1&&com==0)||(me==2&&com==1)) {
				System.out.println("�̰���ϴ�.");
			}else {
				System.out.println("�߸��Է��ѵ�...");
//				break;
//			}
		}
	}
}