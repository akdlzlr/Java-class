package Ex08_ArraysClass;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx {

	public static void main(String[] args) {

		int[] scores = { 99, 97, 98 };

		Arrays.sort(scores); // 기본적으로 오름차순으로 정렬한다.
		System.out.println(Arrays.toString(scores));
		System.out.println();

///////////////////////////////////////////////////////////////////////////////////////
				
		String[] names = { "홍길동", "박동수", "김민수" };

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		int num = Arrays.binarySearch(names, "박동수"); // sort 필수
		System.out.println("박동수의 위치 : " + num);
		System.out.println();

		Member m1 = new Member("홍길동", "a@naver.com");
		Member m2 = new Member("박동수", "b@naver.com");
		Member m3 = new Member("김민수", "kim@naver.com");

		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		num = Arrays.binarySearch(members, new Member("홍길동", "hong@naver.com"));
		System.out.println(Arrays.toString(members));
		System.out.println("홍길동의 위치 : " + num);
		System.out.println();

//		Arrays.sort(members, (o1, o2) -> o2.compareTo(o1));
//		아래를 람다식을 이용하여 간략화 한 것이다.
		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				//return -o1.compareTo(o2);
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(members));
		
//		Arrays.sort(members, (o1,o2)-> o1.email.compareTo(o2.email));
//		아래를 람다식을 이용하여 간략화 한 것이다.
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