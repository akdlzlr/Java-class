package chapter4;

public class Ex10_TimesTable {
	public static void main(String[] args) {
		int x=2;
		for(int i=1;i<=9;i++) {
			System.out.println(x+"x"+i+"="+(x*i));
		}
		
//		for(int i=1;i<=9;i++) {  // i�� for���� �����Ҷ��� ������ ������ ����
//			int result = x * i;
//			//result�� ������ �������� �����ǰ� �������.
//		}
		
		for(int i=2;i<=9;i++) {
			System.out.println("---"+i+"��"+"---");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int n = 10;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i+1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)+1;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}