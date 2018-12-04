package Ex04_NIButton;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
//	필드 초기값으로 대입
	Button.OnClickListener listener = ()->System.out.println("전화를 겁니다.");
	
	
	Window(){
		button1.setOnClickListener(listener);
//		매개값으로 대입
		button2.setOnClickListener(()->System.out.println("메세지를 보냅니다."));			
	}
}