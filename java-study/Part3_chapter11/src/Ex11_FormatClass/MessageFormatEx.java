package Ex11_FormatClass;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
		String id = "java";
		String name = "�ſ��";
		String tel = "010-1234-5678";
		
		String text = "ȸ�� id : {0} \nȸ�� �̸� : {1}\nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values ({0}, {1} , {2})";
		Object[] arg = {"java", "'�ſ��'", "'010-1234-5678'"};
		String result2 = MessageFormat.format(sql, arg);
		System.out.println(result2);
		
		String result3 = String.format("insert into member values ('%s', '%s', '%s')",id, name, tel);
		System.out.println(result3);
		
		System.out.printf("insert into member values ('%s', '%s', '%s')\n",id,name,tel);
	}
}
