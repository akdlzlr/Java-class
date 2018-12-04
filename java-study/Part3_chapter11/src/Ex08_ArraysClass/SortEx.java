package Ex08_ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx {

	public static void main(String[] args) {

		int[] scores = { 99, 97, 98 };

		Arrays.sort(scores); // �⺻������ ������������ �����Ѵ�.
		System.out.println(Arrays.toString(scores));
		System.out.println();

///////////////////////////////////////////////////////////////////////////////////////
				
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		int num = Arrays.binarySearch(names, "�ڵ���"); // sort �ʼ�
		System.out.println("�ڵ����� ��ġ : " + num);
		System.out.println();

		Member m1 = new Member("ȫ�浿", "a@naver.com");
		Member m2 = new Member("�ڵ���", "b@naver.com");
		Member m3 = new Member("��μ�", "kim@naver.com");

		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		num = Arrays.binarySearch(members, new Member("ȫ�浿", "hong@naver.com"));
		System.out.println(Arrays.toString(members));
		System.out.println("ȫ�浿�� ��ġ : " + num);
		System.out.println();

//		Arrays.sort(members, (o1, o2) -> o2.compareTo(o1));
//		�Ʒ��� ���ٽ��� �̿��Ͽ� ����ȭ �� ���̴�.
		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				//return -o1.compareTo(o2);
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(members));
		
//		Arrays.sort(members, (o1,o2)-> o1.email.compareTo(o2.email));
//		�Ʒ��� ���ٽ��� �̿��Ͽ� ����ȭ �� ���̴�.
		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				//return -o1.compareTo(o2);
				return o1.email.compareTo(o2.email);
			}
		});

		System.out.println(Arrays.toString(members));
	}
}