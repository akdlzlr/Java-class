package Ex04_NIButton;

public class Button {
//	��ø Ŭ���� �������̽�	
	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {			//	onClick�� ������ ������ ��ü���� ���۽�Ų��. (����=delegation)
		listener.onClick();
	}
	
	void touch(OnClickListener listener) {
		listener.onClick();
	}
}