package edu.iot.part3.chapter18.ex05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;


public class SerializableReader {
	public static void main(String[] args) {
			List<ClassA> list = null;	
		try (
			FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
//				ClassA v = (ClassA) ois.readObject();
//				System.out.println("field1 : "+v.field1);
//				System.out.println("field2.field1 : "+v.field2.field1);
//				System.out.println("field3 : "+v.field3);	//static은 복원이 안댐	
//				System.out.println("fidle4 : "+v.field4);	// transient도 안댐
				list = (List<ClassA>)ois.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(ClassA v : list) {
			System.out.println("field1 : "+v.field1);
			System.out.println("field2 : "+v.field2.field1);
			System.out.println("field3 : "+v.field3);
		}
	}
}
// deap copy의 방법 중 제일 간단한 방법이다. == Clone과 유사하다.(but Clone은 얕은 복사)
