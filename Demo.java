package com.colectionsdemo.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,99,"Hemanth"));
		studs.add(new Student(2,69,"Kishore"));
		studs.add(new Student(3,79,"Ayyappa"));
		studs.add(new Student(4,49,"HemanthK"));
		
		
		Collections.sort(studs,(s1,s2)->{
			
			return s2.marks>s1.marks?-1:s1.marks<s2.marks?1:0;
		});
		
		
		for(Student s:studs)
		System.out.println(s);
	}

}


class Student{
	int rollno;
	int marks;
	String name;
	public Student(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
		
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
}
