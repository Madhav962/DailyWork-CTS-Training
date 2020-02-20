package com.trainingdata;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee> list= new ArrayList<>();
		
		addEmployees(list);
		
		SortByDesignationComparator sbi = new SortByDesignationComparator();
		Collections.sort(list, sbi);
		
		/*SortBySalaryComparator sbi = new SortBySalaryComparator();
		Collections.sort(list, sbi);*/
		
		/*SortByAddressComparator sbi = new SortByAddressComparator();
		Collections.sort(list, sbi);*/
		
		/*SortByNameComparator sbi = new SortByNameComparator();
		Collections.sort(list, sbi);*/
		
		/*SortByIdComparatorInterface sbi = new SortByIdComparatorInterface();
		Collections.sort(list, sbi);*/
		
		/*SortByAgeCompartor sbi = new SortByAgeCompartor();
		Collections.sort(list, sbi);*/
		
		/*SortByPhoneComparator sbi = new SortByPhoneComparator();
		Collections.sort(list, sbi);*/
		for(Employee emp: list) {
			System.out.println(emp);
		}
		
	}

	private static void addEmployees(ArrayList<Employee> list) {
		
		Employee emp1= new Employee(4234,56,"Vijay","Bangalore","Developer",41241.28,798797855);
		Employee emp2= new Employee(2324,23,"Neeraj","Mumbai","Software Engineer",465.50,7956955);
		Employee emp3= new Employee(9987,21,"Sakshi","Indore","Test Engineer",6152.56,7987855);
		Employee emp4= new Employee(1234,19,"Neha","Pune","DevOps Engineer",455.89,79567855);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
	}

}
