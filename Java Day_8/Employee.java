package com.day8.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 7868806093062510402L;

//		int id;
//		String name;
//		String address;
//		String designation;
//		int age;
//		double salary;
//		long phone;
	
//	using transient keyword it will produce null values for address and age
	
	int id;
	String name;
	transient String address;
	String designation;
	transient int age;
	double salary;
	long phone;

		public Employee() {
		}

		public Employee(int id, String name, String address, int age, double salary, long phone) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			
			this.age = age;
			this.salary = salary;
			this.phone = phone;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}


		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address 
			+ ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
		}

	

	}