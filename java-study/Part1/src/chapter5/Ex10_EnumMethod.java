package chapter5;

public class Ex10_EnumMethod {
	public static void main(String[] args) {

//				name() �޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);

//				ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);

//				compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
//				valueOf() �޼ҵ�
		Week WeekDay = Week.valueOf("SUNDAY");		// String���� ���� ������
		if(WeekDay == Week.SATURDAY || 
						WeekDay == Week.SUNDAY) {	// .equal()�� ���Ͽ��� �Ѵ�.
			System.out.println("�ָ��̴�!!!!!!!");
		}else {
			System.out.println("�����̴�.....");
		}
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̴�!!!!!!!");
			}else {
				System.out.println("�����̴�.....");
			}
		}
		System.out.println(args.length);
		
//			values() �޼ҵ�
		Week[] days = Week.values();
		for(Week day : days) {				//Week��� Ŭ������ day��� ����
			System.out.println(day);		//String strDay ���� Ŭ������ Ÿ������ ���
		}
	}
}
