package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {
	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student[] {
						new Student(9, "Matt",7.22),
						new Student(3, "Hannah",4.0),
						new Student(7, "Romeo",5.9),
						new Student(8, "Eric",9.8),
						new Student(6, "Hannah",10.2)
				}
					));
		System.out.println("Original List");
		for(Student s:studentList) {
			System.out.println(s);
		}
		System.out.println("==================");
		Collections.sort(studentList);
		System.out.println("Sorted by studentID");
		for(Student s:studentList) {
			System.out.println(s);
		}
		System.out.println("==================");
		Collections.sort(studentList, new StudentComparator());//overloading
		System.out.print("Sorted by gpa\n");
		for(Student s:studentList) {
			System.out.println(s);
		}
		System.out.println("==================");
		System.out.println("Sorted by label using lambda");
		Collections.sort(studentList,(arg0,arg1) 
				->{
					return arg0.getLabel().compareTo(arg1.getLabel());
				}
				
				);
		for(Student s:studentList) {
			System.out.println(s);
		}
	}
}
