package Stack2;

import Stack2.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		System.out.println(stack.push(10));
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
//		if(!stack.push(100)) {
//			System.out.println("스택 오버플로우");
//		}
		System.out.println();
		
		int value = 0;
		
		
		// 예외 발생
		if(stack.isEmpty()) {
			System.out.println("스택이 비었습니다.");
		}else {
			value = (int)stack.pop();
			System.out.println(value);
		}
	}
}
