package Stack2;

public class Stack {

	public final static int SIZE = 5;
	private Object[] stack; 
	private int top; 

	public Stack() {
		stack = new Object[SIZE]; 
		top = -1; 
	}

	public Stack(int size) { 
		stack = new Object[size];
		top = -1;
	}

	public boolean push(Object value) {		// 매개변수에서 UpCasting이 일어남 
		if (top >= (stack.length - 1)) {
			Object[] newStack = new Object[2 * stack.length];
			
			System.arraycopy(stack, 0, newStack, 0, stack.length);
			
			stack = newStack;
		}
		top++;
		stack[top] = value;
		return true;
	}

	public Object pop() {		//	Object 타입으로 꺼내야함
		Object value = stack[top];
		top--;
		return value;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
