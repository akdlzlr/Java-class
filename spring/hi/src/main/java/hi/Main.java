package hi;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g = ctx.getBean("greeter",Greeter.class);
		Greeter g2 = ctx.getBean("greeter",Greeter.class);
		Greeter g3 = ctx.getBean("greeter2",Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		
//		싱글톤이다.
		System.out.println("(g==g2) = "+(g==g2));
//		같은 클래스여도 빈 객체의 정의가 다르면 각자 싱글톤으로 운영.
		System.out.println("(g2==g3) = "+(g2==g3));
		
		ctx.close();
	}
}

