package chapter7;

public class Ex01_DmbCellPhoneEx {	
	public static void main(String[] args) {
//		���� �޼��忡���� �ڽ��� �θ� ��ӹ޾Ҵ��� ������ �ʴ´�.
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
