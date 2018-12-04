package chapter7;

public class Ex01_DmbCellPhoneEx {	
	public static void main(String[] args) {
//		메인 메서드에서는 자식이 부모를 상속받았는지 보이지 않는다.
		Ex01_DmbCellPhone dmbCellPhone = 
				new Ex01_DmbCellPhone("iPhone", "silver", 5);
		
		System.out.println("model : "+dmbCellPhone.model);
		System.out.println("color : "+dmbCellPhone.color);
		
		System.out.println("channel : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.receiveVoice("hi~");
		dmbCellPhone.sendVoice("bye!");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(9);
		dmbCellPhone.turnOffDmb();
	}
}
