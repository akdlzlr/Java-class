package Ex05_ClassCall;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflctionEx {
	
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 클래스 명 : ");
		String className = scanner.nextLine();
//		Member의 내부클래스를 보려면 Member$Builder를 입력해야한다.
		Class clazz = Class.forName("Ex05_ClassCall."+className);
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
//		Constructor[] constructors = clazz.getDeclaredConstructors(); // 정의된 생성자 다 리턴
		Constructor[] constructors = clazz.getConstructors();	// 접근이 허용된 생성자만 리턴
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName()+"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+" "+field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
//		Method[] methods = clazz.getDeclaredMethods();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
	}
	
	
	
	
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
}
