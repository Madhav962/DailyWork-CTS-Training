package com.trainingdata;

import java.util.Comparator;

public class SortByAddressComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getaddress().compareTo(emp2.getaddress());
	}

	
}
