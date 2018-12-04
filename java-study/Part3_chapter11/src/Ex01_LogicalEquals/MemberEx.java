package Ex01_LogicalEquals;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)){
			System.out.println("1��2�� ������");
		}else {
			System.out.println("������������");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("1�� 3�� ������");
		}else {
			System.out.println("������������");
		}
		
		System.out.println(obj1.hashCode());	//������ �� �޸� �ּ�...
		System.out.println(obj2.hashCode());	//object�� �⺻ �ؽ��ڵ�
		System.out.println(obj3.hashCode());	//10������ ǥ����
		
		System.out.println(obj1);				//16������ ǥ���� �޸��ּ�(������)
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
