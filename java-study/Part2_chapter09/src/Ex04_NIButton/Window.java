package Ex04_NIButton;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
//	�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = ()->System.out.println("��ȭ�� �̴ϴ�.");
	
	
	Window(){
		button1.setOnClickListener(listener);
//		�Ű������� ����
		button2.setOnClickListener(()->System.out.println("�޼����� �����ϴ�."));			
	}
}