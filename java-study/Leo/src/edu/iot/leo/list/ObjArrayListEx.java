package edu.iot.leo.list;

import edu.iot.leo.test.Member;

public class ObjArrayListEx {
	public static void main(String[] args) {
		
		ObjList<Integer> list = new ObjArrayList<>();
		
		
		list.add(1);
		list.add(2);
		list.add(4);
//		list.add(10, 20);
//		list.swap(20, 30);
//		list.get(30);
//		list.remove(40);
//		list.set(50, 1);
		Object temp =list.remove(2);
		System.out.println("������ ������ : "+temp);
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ListStack stack = new ListStack();
		stack.push(3);
		stack.push(4);
		
		ObjList memberList = new ObjArrayList();
		Member member = new Member.Builder()
									.setName("�Ѹ�") // �޼��� ü�̴�
									.setUserId("Dul")
									.setPassword("1234")
									.build();
		Member a = member.getMember();
		memberList.add(member);
		member = new Member.Builder()
									.setName("��ġ")
									.setUserId("chi")
									.setPassword("1234")
									.build();
		memberList.add(member);
		memberList.add(a);
		for(int i = 0; i < memberList.size();i++) {
			System.out.println(memberList.get(i)+"asdfasdfsdaf");
		}
		
		System.out.println();
		System.out.println();
		
		memberList.swap(0, 1);
		
		for(int i = 0; i < memberList.size();i++) {
			System.out.println(memberList.get(i)+"asdfasdfsdaf");
		}
		
		
		
		
		
		
		
		
	}
}