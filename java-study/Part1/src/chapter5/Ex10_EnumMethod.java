package chapter5;

public class Ex10_EnumMethod {
	public static void main(String[] args) {

//				name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);

//				ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);

//				compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
//				valueOf() 메소드
		Week WeekDay = Week.valueOf("SUNDAY");		// String으로 값을 받으면
		if(WeekDay == Week.SATURDAY || 
						WeekDay == Week.SUNDAY) {	// .equal()로 비교하여야 한다.
			System.out.println("주말이다!!!!!!!");
		}else {
			System.out.println("평일이다.....");
		}
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이다!!!!!!!");
			}else {
				System.out.println("평일이다.....");
			}
		}
		System.out.println(args.length);
		
//			values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {				//Week라는 클래스에 day라는 변수
			System.out.println(day);		//String strDay 같이 클래스를 타입으로 사용
		}
	}
}
