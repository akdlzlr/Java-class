package StackTest;

public class Stack {
//	실행되면 사이즈는 변하지 않으므로 상수로 지정한다. 보통 상수는 public으로 지정한다.
//	관례상 상수는 제일 위에 선언한다. static final == final static 같은표현
	public final static int SIZE=5;
	private int[] stack;	// 접근제한자를 꼭 붙인다.
	private int top;	// 인덱스 정보...

	
	public Stack() {
		stack = new int[SIZE];	// 5개의 공간이 0으로 초기화
		top = -1;		// -1로 초기화하면 스택에 비어있다는 뜻이다.
	}

	public Stack(int size) {	// 리턴 타입을 지정하지 않는다.
		stack = new int[size];
		top = -1;		
	}

	 public boolean push(int value) {	// 배열의 타입과 집어넣는 데이터 타입이 동일해야한다.
		if(top >= (stack.length-1)) {// top++ 연산 전에 stack.length -1 하여
			// 현재 길이의 2배 길이를 가지는 새로운 배열 생성
			int[] newStack = new int[2*stack.length];
			// 이전 배열에서 새로운 배열로 데이터 복사
			System.arraycopy(stack, 0, newStack,0, stack.length);
			// stack 변수가 새로운 배열을 참조하도록 함.
			stack=newStack;
		}
		
		top++;
		stack[top] = value;
		return true;
		
	}
	
	 public int pop() {
		
//		 if(top>=0) {
			int value = stack[top];
			top--;
			return value;
//		} 
	 }
	
	 public boolean isEmpty(){
		return top==-1;
	}
}