package Ex06_NewInstance;

import java.util.Scanner;

public class ActionEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("실행 클래스명 : ");
		String className = scanner.nextLine();
		
		try {
			Class clazz = Class.forName("Ex06_NewInstance."+className);
			Action action = (Action)clazz.newInstance();
			action.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}