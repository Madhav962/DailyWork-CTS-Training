package com.trainingdata;

import org.omg.CORBA.PUBLIC_MEMBER;

import TrainingData.GetSet;

public class Employee implements Comparable<Employee> {

	int id,age;
	String name,address,designation;
	double salary;
	long phone;
	public Employee()
	{
	}
	
	public Employee(int id, int age, String name, String address, String designation, double salary, long phone) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.salary = salary;
		this.phone = phone;
	}
	public int getAge()
	{
		return age;
	}

	public void setAge( int age)
	{
		this.age=age;
	}
	public int getid()
	{
		return id;
	}

	public void setid( int id)
	{
		this.id=id;
	}
	public String getaddress()
	{
		return name;
	}

	public void setaddress( String address)
	{
		this.address=address;
	}
	public String getdesignation()
	{
		return address;
	}

	public void setdesignation( String designation)
	{
		this.designation=designation;
	}
	public String getname()
	{
		return name;
	}

	public void setid( String name)
	{
		this.name=name;
	}
	public double getsalary()
	{
		return salary;
	}

	public void setsalary( double salary)
	{
		this.salary=salary;
	}
	public long getphone()
	{
		return phone;
	}

	public void setphone( long phone)
	{
		this.phone=phone;
	}
	
	
	
	public static void main(String[] args) {
	
		

	}

	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + ", designation="
				+ designation + ", salary=" + salary + ", phone=" + phone + "]";*/
	@Override
	public String toString() {
		return id+ ": "+name +": "+designation+": "+phone+":"+age;
		}

	
	@Override
	public int compareTo(Employee emp) {
		if(this.age>emp.age)
		{
			return -1;
		}
		else if(this.age==emp.age)
		{
			return 0;
		}
		else
		{
//		Employee emp=(Employee)obj;
		return 1;
	}
	

	}

}
