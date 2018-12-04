package Ex04_NIButton;

public class Button {
//	중첩 클래스 인터페이스	
	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {			//	onClick의 동작을 구현된 객체에서 동작시킨다. (위임=delegation)
		listener.onClick();
	}
	
	void touch(OnClickListener listener) {
		listener.onClick();
	}
}