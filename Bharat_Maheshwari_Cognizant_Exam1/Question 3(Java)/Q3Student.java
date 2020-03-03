package com.test.programs;

import java.util.ArrayList;

public class Q3Student {
		public static void main(String[] args) {
			ArrayList<Student> students =  new ArrayList<>();
			Student std1 = new Student(01, "Pulkit", 70);
			Student std2 = new Student(02, "Naveen", 58);
			Student std3 = new Student(03, "Neeraj", 28);
			Student std4 = new Student(04, "Bharat", 84.7);
			students.add(std1);
			students.add(std2);
			students.add(std3);
			students.add(std4);
			System.out.println("Pulkit is "+ grades(std1) + ".");
			System.out.println("Naveen is "+ grades(std2) + ".");
			System.out.println("Neeraj is "+ grades(std3) + ".");
			System.out.println("Bharat is "+ grades(std4) + ".");
		}
		public static String grades(Student student) {
				if (student.getMarks() >= 80) {
					return "Distinction";
				}else if(student.getMarks() >= 60 && student.getMarks() <=79 ) {
					return "First Class";
				}else if(student.getMarks() >= 50 && student.getMarks() < 60) {
					return "Second Class";
				}else {
					return "Fail";
				}
		}

}
