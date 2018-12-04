package edu.iot.part3.chapter18.ex06;

import java.net.InetAddress;

public class InetAddressEx {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 ip 주소 : "+ local.getHostAddress());
			
			InetAddress[] iaArr=InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote:iaArr) {
				System.out.println("www.naver.com IP 주소 : "+remote.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
