package com.trainingdata;
import java .util.Comparator;

public class SortByIdComparatorInterface implements Comparator<Employee>{



	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		if(emp1.getid()>emp2.getid())
		{
			return -1;
		}
		else if(emp1.getid()==emp2.getid())
		{
			return 0;
		}
		else
		{
		return 1;
		
		
	}

	}
}
