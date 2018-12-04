package Ex10_DateCalendarClass;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		strWeek = weekDay[week-1];
		
//		스위치 대신에 배열을 이용해서 만드는게 더 쉬움
//		switch(week) {
//		case Calendar.MONDAY:
//			strWeek = "월";
//			break;
//		case Calendar.TUESDAY:
//			strWeek = "화";
//			break;
//		case Calendar.WEDNESDAY:
//			strWeek = "수";
//			break;
//		case Calendar.THURSDAY:
//			strWeek = "목";
//			break;
//		case Calendar.FRIDAY:
//			strWeek = "금";
//			break;
//		case Calendar.SATURDAY:
//			strWeek = "토";
//			break;
//		default:
//			strWeek = "일";
//		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
//		if(amPm == Calendar.AM) {
//			strAmPm = "오전";
//		}else {
//			strAmPm = "오후";
//		}
//		if문 대신 삼항 연산자를 이용하기
		strAmPm = (amPm == Calendar.AM)	?	"오전"	:	"오후";
//						조건식			?	true	:	false
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년" );
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
//		월의 마지막 일 찾기
		Calendar cal = Calendar.getInstance();
		System.out.println("Last Dat of Month : "+cal.getActualMaximum
													(Calendar.DAY_OF_MONTH));
		cal = Calendar.getInstance();
		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
//		Calendar -> Date
//		Date lastDayOfMonth = cal.getTime();
//		Date -> Calendar
//		Calendar ?????????????
		
		
		
		
		
		
	}
}




