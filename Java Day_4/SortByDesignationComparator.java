package com.trainingdata;

import java.util.Comparator;

public class SortByDesignationComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getdesignation().compareTo(emp2.getdesignation());
	}

}
