package Ex11_FormatClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now));
				
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));
		
		String from = "2017-04-08 10:10:10";
		
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date to = transFormat.parse(from);		// ����ó���� ����ȭ �Ǿ��ִ�.
	}
}