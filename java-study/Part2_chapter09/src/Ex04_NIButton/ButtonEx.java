package Ex04_NIButton;

import Ex04_NIButton.Button.OnClickListener;

public class ButtonEx {
	public static void main(String[] args) {

		Button btn = new Button();

//		btn.setOnClickListener(new CallListener());
//		btn.touch();
//		
//		btn.setOnClickListener(new MessageListener());
//		btn.touch();
//		
//		btn.setOnClickListener(new CameraListener());
//		btn.touch();

		btn.touch(new CallListener());
		btn.touch(new MessageListener());
		btn.touch(new CameraListener());
		
		
		
//		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("종료합니다.");
				System.exit(0);				
			}
		});
		btn.touch();
		
//		람다식 표현 1
		btn.setOnClickListener(() -> {
			System.out.println("종료합니다.");
			System.exit(0);
		});
		btn.touch();
//		람다식 표현 2
		btn.setOnClickListener(()->System.exit(0));
		btn.touch();
	}
}