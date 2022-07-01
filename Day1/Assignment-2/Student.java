package org.student;

import org.department.Department;

public class Student extends Department{
	
	//Creating method studentName
	public String studentName() {
		return "Hinata";
	}
	
	//Creating method studentDept
	public String studentDept() {
		return "Information Technology";
	}
	
	//Creating method studentId
	public String studentId() {
		return "20DX20";
	}
	public static void main(String[] args) {
		
		//Creating object for class student
		Student obj = new Student();
		
		//Calling all methods using multiple inheritance
		System.out.println("Collage Name: " + obj.collegeName());
		System.out.println("Collage Code: " + obj.collageCode());
		System.out.println("Collage Rank: " + obj.collageRank());
		System.out.println("Department: " + obj.deptName());
		System.out.println("Student Name: "+ obj.studentName());
		System.out.println("Student Department: " + obj.studentDept());
		System.out.println("Student Id: " + obj.studentId());
	}
}
