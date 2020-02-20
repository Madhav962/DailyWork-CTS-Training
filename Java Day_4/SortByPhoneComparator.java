package com.trainingdata;

import java.util.Comparator;

public class SortByPhoneComparator implements Comparator<Employee> {

	

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		if(emp1.getphone()>emp2.getphone())
		{
			return -1;
		}
		else if(emp1.getphone()==emp2.getphone())
		{
			return 0;
		}
		else
		{
		return 1;
		
		
	}

	}
}
