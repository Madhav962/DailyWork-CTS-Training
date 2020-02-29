package com.employee.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SpringLayout.Constraints;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;



public class EmployeeTest {
	
	private static EmployeeDAOImpl employeeDAO;
	private static Employee employee;

	@BeforeClass

	public static void init()

	{
		employee= new Employee();
		employeeDAO= new EmployeeDAOImpl();
	}
	@Ignore
	@Test
	public void test_add_employee_success()
	{
		Employee emp= new Employee(135, "Naveen", "Bhopal", 22, 23534, 43553456);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}
	@Ignore
	@Test
	public void test_FetchEmployee1_success()
	{
		Employee emp= employeeDAO.getEmployeeById(135);
		assertEquals("Naveen", emp.getName());
		
	}
	
	@Ignore
	@Test
	public void test_update_success()
	{
		Employee emp= employeeDAO.getEmployeeById(134);
		emp.setAddress("Indore");
		assertEquals(true, employeeDAO.updateEmployee(emp));
		
	}
	@Ignore
	@Test
	public void test_delete_success()
	{
		Employee emp= employeeDAO.getEmployeeById(133);
		assertEquals(true, employeeDAO.deleteEmployee(emp));
	}
	@Ignore
	@Test
	public void test_getallemployee_success()
	{
		List<Employee> lemp= employeeDAO.getAllEmployees();
//		assertEquals(5, lemp.size());
//		assertEquals("pulkit", lemp.get(1).getName());
		assertEquals("Bhopal", lemp.get(4).getAddress());
	}
		
	//*************Only used when id is not in the database and we are checking for it to make test case successful we throw nullpointerexception****************************
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_FetchEmployee_success()
	{
		Employee emp= employeeDAO.getEmployeeById(136);
		assertEquals("Naveen", emp.getName());
		
	}
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_delete1_success()
	{
		Employee emp= employeeDAO.getEmployeeById(568);
		assertEquals(true, employeeDAO.deleteEmployee(emp));
	}
	@Ignore
	@Test(expected= MySQLIntegrityConstraintViolationException.class)
	public void test_add_employee_failure()
	{
		Employee emp= new Employee(135, "Naveen", "Bhopal", 22, 23534, 43553456);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}
	
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_update1_success()
	{
		Employee emp= employeeDAO.getEmployeeById(568);
		emp.setAddress("Indore");
		assertEquals(true, employeeDAO.updateEmployee(emp));
		
	}
	
	@Test(expected= Exception.class)
	public void test_getallemployee1_success()
	{
		List<Employee> lemp= employeeDAO.getAllEmployees();
//		assertEquals(5, lemp.size());
//		assertEquals("pulkit", lemp.get(1).getName());
		assertEquals("Bhopal", lemp.get(3).getAddress());
	}
	
	
	
	
}
