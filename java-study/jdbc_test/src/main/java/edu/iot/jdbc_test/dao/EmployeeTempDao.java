package edu.iot.jdbc_test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.iot.jdbc_test.Database;
import edu.iot.jdbc_test.model.Employee;

public class EmployeeTempDao {
	private Connection conn = Database.getConnection();
	
	public int count() throws Exception{
		String sql = "select count(*) cnt from hr.employees";
		
		try(Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql)){
		rs.next();
		return rs.getInt("cnt");
		}
	}
	
	//	primary Key(employee_id 컬럼)로 찾기
	public Employee findById(long id) throws Exception{
		String sql="select * from hr.employees where employee_id=" + id;
		
		Employee emp=null;
		try(Statement stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql)){
			if(rs.next()) {
				// ResultSet -> Employee로 변환
				emp=map(rs);
			}
		}
		return emp;
		
	}
	public List<Employee> getList() throws Exception{
		List<Employee> list= new ArrayList<>();
		String sql = "select * from hr.employees";
		
		try(Statement stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql)){
			while(rs.next()) {
				list.add(map(rs));
			}
		}
		return list;
	}
	
	public List<Employee> findByName(String name) throws Exception{
		List<Employee> list = new ArrayList<>();
		
		name="%"+name.toLowerCase()+"%";
		String sql = "select * from hr.employees where lower(last_name) like ?";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, name);
			
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					list.add(map(rs));
				}
			}
		}
		return list;
	}
	
	private Employee map(ResultSet rs) throws Exception {
		Employee emp=Employee.builder()
				.employeeId(rs.getLong("employee_id"))
				.lastName(rs.getString("last_name"))
				.firstName(rs.getString("first_name"))
				.commissionPct(rs.getDouble("commission_pct"))
				.departmentId(rs.getInt("department_id"))
				.email(rs.getString("email"))
				.hireDate(rs.getDate("hire_date"))
				.jobId(rs.getString("job_id"))
				.managerId(rs.getInt("manager_id"))
				.phoneNumber(rs.getString("phone_number"))
				.salary(rs.getDouble("salary"))
				.build();
		return emp;
	}
}