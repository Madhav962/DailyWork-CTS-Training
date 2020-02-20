package com.trainingdata;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getname().compareTo(emp2.getname());
	}

}
