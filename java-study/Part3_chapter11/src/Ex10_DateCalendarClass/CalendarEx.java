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
		
		String[] weekDay = {"��", "��", "ȭ", "��", "��", "��", "��"};
		strWeek = weekDay[week-1];
		
//		����ġ ��ſ� �迭�� �̿��ؼ� ����°� �� ����
//		switch(week) {
//		case Calendar.MONDAY:
//			strWeek = "��";
//			break;
//		case Calendar.TUESDAY:
//			strWeek = "ȭ";
//			break;
//		case Calendar.WEDNESDAY:
//			strWeek = "��";
//			break;
//		case Calendar.THURSDAY:
//			strWeek = "��";
//			break;
//		case Calendar.FRIDAY:
//			strWeek = "��";
//			break;
//		case Calendar.SATURDAY:
//			strWeek = "��";
//			break;
//		default:
//			strWeek = "��";
//		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
//		if(amPm == Calendar.AM) {
//			strAmPm = "����";
//		}else {
//			strAmPm = "����";
//		}
//		if�� ��� ���� �����ڸ� �̿��ϱ�
		strAmPm = (amPm == Calendar.AM)	?	"����"	:	"����";
//						���ǽ�			?	true	:	false
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "��" );
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "�� ");
		
//		���� ������ �� ã��
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




