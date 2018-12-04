package edu.iot.jdbc_test;

import java.util.List;

import edu.iot.common.ui.Prompt;
import edu.iot.jdbc_test.dao.EmployeeTempDao;
import edu.iot.jdbc_test.model.Employee;

public class FindNameEx {
	public static void main(String[] args) {

		Prompt prompt = new Prompt();
		String name = prompt.getString("이름");

		EmployeeTempDao dao = new EmployeeTempDao();
//		try catch로 하지않고 위에서 throws로 던지면 아래에 있는 Database.close가 실행되지 않고 종료된다.
		try {
			int total = dao.count();
			System.out.println("검색어 : " + name);
//			name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
			
			List<Employee> list = dao.findByName(name);
			int find = list.size();
			
			System.out.printf("%d건/총%d건\n", find, total);
			for (Employee emp : list) {
				System.out.println(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Database.close();
	}
}