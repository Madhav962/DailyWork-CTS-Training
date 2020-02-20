package com.trainingdata;

import java.util.Comparator;

public class SortBySalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		

		if(emp1.getsalary()>emp2.getsalary())
		{
			return -1;
		}
		else if(emp1.getsalary()==emp2.getsalary())
		{
			return 0;
		}
		else
		{
		return 1;
	}
	}

	
}
