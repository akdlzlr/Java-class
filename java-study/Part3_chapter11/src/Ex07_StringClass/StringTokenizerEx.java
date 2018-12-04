package Ex07_StringClass;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
//		����	
		String text2 = "name=ȫ�浿&age=20&password=123";
//		url ������ ���ڿ��� ex)naver.com/search.nhn?sLn=kr&searchOption=all&query=iterate
		
		StringTokenizer st2 = new StringTokenizer(text2, "&");
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
//			��� 1
			String []t = token.split("=");
			String key = t[0];
			String value = t[1];
			
			String setter = "set"+ key.substring(0,	1).toUpperCase()+
									key.substring(1);
			
			System.out.println(key+":"+value+"->"+
								setter);
			
//			��� 2
			String firstStr=token.substring(0, token.indexOf("="));
			String firstStr1=(firstStr.substring(0,1)).toUpperCase();
			
			String secondStr=token.substring(token.indexOf("=")+1);
			String setter2 = "set" + firstStr1+firstStr.substring(1);
			System.out.println(firstStr+":"+secondStr+"->"+
								setter2);
		}
	}
}