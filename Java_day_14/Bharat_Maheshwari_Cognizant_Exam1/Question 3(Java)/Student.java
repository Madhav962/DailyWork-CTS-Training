package com.test.programs;

public class Student {

		int id;
		String name;
		double marks;
		public Student(int id, String name, double marks) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
		public Student() {
			super();
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
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
	}

