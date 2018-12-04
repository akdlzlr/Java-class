package edu.iot.part3.chapter18.ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectInputOutputStreamEx {
	public static void main(String[] args) {
		
		try (
			FileOutputStream fos = new FileOutputStream("C:/Temp/Object.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
				Date now = new Date();
				oos.writeObject(10);
				oos.writeObject(3.14);
				oos.writeObject(new int[] {1,2,3});
				oos.writeObject(new String("홍길동"));
				oos.writeObject(now);
				oos.flush(); oos.close(); oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("C:/Temp/Object.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
			){
				int obj1 = (int) ois.readObject();
				double obj2 = (double) ois.readObject();
				int[] obj3 = (int[]) ois.readObject();
				String obj4 = (String) ois.readObject();
				Date obj5 = (Date) ois.readObject();
				
				System.out.println(obj1);
				System.out.println(obj2);
				System.out.println(obj3[0]+", "+obj3[1]+", "+obj3[2]);
				System.out.println(obj4);
				System.out.println(obj5);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
