package chapter4;

public class Test03_Fibona {
	public static void main(String[] args) {
		int n=1;
		int m=1;
		int sum;
		
		for(int i=0;i<10;i++) {
			sum=n+m;
			System.out.print(sum+" ");
			n=m;
			m=sum;
		}	
	}
}