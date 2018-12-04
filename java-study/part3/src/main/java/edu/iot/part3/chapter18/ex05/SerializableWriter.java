package edu.iot.part3.chapter18.ex05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableWriter {

	public static void main(String[] args) throws Exception{
		
		List<ClassA> list = new ArrayList<>();
		for(int i= 0;i<100;i++) {		
			ClassA classA = new ClassA();
			classA.field1 = i+1;
			classA.field2.field1 = i+2;
			classA.field3 = i+3;
			classA.field4 = i+4;
			list.add(classA);
		}
		
		try (FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);)
		{
//			ClassA classA = new ClassA();
//			classA.field1 = 1;
//			classA.field2.field1 = 2;
//			classA.field3 = 3;
//			classA.field4 = 4;
//			oos.writeObject(classA);
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
