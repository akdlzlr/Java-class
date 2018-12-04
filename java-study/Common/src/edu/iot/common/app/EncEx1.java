package edu.iot.common.app;

import edu.iot.common.sec.SHA256Util;

public class EncEx1 {
	public static void main(String[] args) {
		String pw = "1234";
		String salt = SHA256Util.generateSalt();
		String encPw = SHA256Util.getEncrypt(pw, salt);
		
		System.out.println(salt);
		System.out.println(encPw);
		encPw = SHA256Util.getEncrypt(pw, salt);
		System.out.println(encPw);
	}
}
