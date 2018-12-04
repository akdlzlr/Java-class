package StackTest;

public class Stack {
//	����Ǹ� ������� ������ �����Ƿ� ����� �����Ѵ�. ���� ����� public���� �����Ѵ�.
//	���ʻ� ����� ���� ���� �����Ѵ�. static final == final static ����ǥ��
	public final static int SIZE=5;
	private int[] stack;	// ���������ڸ� �� ���δ�.
	private int top;	// �ε��� ����...

	
	public Stack() {
		stack = new int[SIZE];	// 5���� ������ 0���� �ʱ�ȭ
		top = -1;		// -1�� �ʱ�ȭ�ϸ� ���ÿ� ����ִٴ� ���̴�.
	}

	public Stack(int size) {	// ���� Ÿ���� �������� �ʴ´�.
		stack = new int[size];
		top = -1;		
	}

	 public boolean push(int value) {	// �迭�� Ÿ�԰� ����ִ� ������ Ÿ���� �����ؾ��Ѵ�.
		if(top >= (stack.length-1)) {// top++ ���� ���� stack.length -1 �Ͽ�
			// ���� ������ 2�� ���̸� ������ ���ο� �迭 ����
			int[] newStack = new int[2*stack.length];
			// ���� �迭���� ���ο� �迭�� ������ ����
			System.arraycopy(stack, 0, newStack,0, stack.length);
			// stack ������ ���ο� �迭�� �����ϵ��� ��.
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