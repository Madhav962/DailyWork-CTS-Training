package com.cts.training.controller;
import java.util.Scanner;
import java.util.List;
import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeControllerWithSwitc {
	
	public static void main(String args[]){
		
	
	Scanner src = new Scanner(System.in);
	EmployeeDAO empObj= new EmployeeDAOImpl();

	int choice;
	do {
		System.out.println("*************** Employee Management ***************");
		System.out.println("Press 1 to Add Employee.\nPress 2 to Update Employee.\nPress 3 to Remove Employee.\n"
				+ "Press 4 to get Employee by Id.\nPress 5 to Display all Employees.\nPress 6 to Exit.\n\n");
		System.out.println("Enter your choice: ");
		choice = src.nextInt();
		switch (choice) {
		case 1:
			System.out.println("********** Adding Employee **********");
			System.out.println("Enter Id for an employee: ");
			int i = src.nextInt();
			
			System.out.println("Enter name of an employee: ");
			src.nextLine();
			String N = src.nextLine();
			
			System.out.println("Enter address of an employee: ");
			String A = src.nextLine();

			System.out.println("Enter age of an employee: ");
			int Ag = src.nextInt();
			System.out.println("Enter salary of an employee: ");
			double S = src.nextDouble();
			System.out.println("Enter phone number of an employee: ");
			long P = src.nextLong();
			Employee emp = new Employee(i,N,A,Ag,S,P);
			empObj.saveEmployee(emp);
//			List<Employee> list1 = empObj.getAllEmployees();
//			list1.forEach(System.out::println);
			System.out.println("Inserted Successfully");
			break;
		case 2:
			System.out.println("********** Updating Employee **********");
			Employee em = empObj.getEmployeeById(4);
			em.setAddress("Thane");
			empObj.updateEmployee(em);
			if (empObj.updateEmployee(em)==true)
				System.out.println("Element Updated");
			else
				System.out.println("Element not updated");
		
			
			break;
		case 3:
			System.out.println("********** Removing Employee **********");
			Employee e1= empObj.getEmployeeById(1);
			empObj.deleteEmployee(e1);
			System.out.println();
			break;
		case 4:
			System.out.println("********** Getting Employee info by its ID **********");
			if (empObj.getEmployeeById(4) == null)
				System.out.println("Element of the given ID not found.");
			else
				System.out.println(empObj.getEmployeeById(4234));
			System.out.println();
			break;
		case 5:
			List<Employee> list5 = empObj.getAllEmployees();
			list5.forEach(System.out::println);
			System.out.println();
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("Invalid choice! Please try again!\n");
			choice = src.nextInt();
		}
	} while (choice != 6);
	
	}
}