package Ex02_HashCode;

import java.util.HashMap;

public class keyEx {
	public static void main(String[] args) {
		HashMap<key, String> hashMap = new HashMap<key,String>();
		
		hashMap.put(new key(1), "ȫ�浿");
		
		String value = hashMap.get(new key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	
	}
}