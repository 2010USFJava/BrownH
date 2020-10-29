package com.revature.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	//second method of comparing- implement Comparator method
	
	//compare students by gpa
	@Override
	public int compare(Student arg0, Student arg1) {
	return (int)((arg0.getGpa()*100)-(arg1.getGpa())*100);

	}
	
}
