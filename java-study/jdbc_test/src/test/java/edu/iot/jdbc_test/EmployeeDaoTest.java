package edu.iot.jdbc_test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.iot.jdbc_test.dao.EmployeeTempDao;
import edu.iot.jdbc_test.model.Employee;

public class EmployeeDaoTest {
	EmployeeTempDao dao;
	
	@Before
	public void setup() {
		dao = new EmployeeTempDao();
	}
	
	@Test
	public void testCount() throws Exception{
		int count = dao.count();
		//System.out.println(count);
	}
	
	@Test
	public void testFindById() throws Exception{
		Employee emp = dao.findById(100);
		assertTrue(emp.getEmployeeId()==100);
		//System.out.println(emp);
		
		emp = dao.findById(1000);
		assertTrue(emp==null);
	}
	
	@Test
	public void testGetList() throws Exception{
		List<Employee> list = dao.getList();
		
		//System.out.println(list);
		assertTrue(list.size()==107);
	}
	
	@Test
	public void testFindByName() throws Exception{
		List<Employee> list = dao.findByName("King");
		
		System.out.println(list.size());
		
	}
}
