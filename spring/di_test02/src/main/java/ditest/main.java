package ditest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
				"classpath:application-context.xml");
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		Camera camera1=ctx.getBean("camera1",Camera.class);
		
		System.out.println(camera1);
		
		ctx.close();
	}

}
