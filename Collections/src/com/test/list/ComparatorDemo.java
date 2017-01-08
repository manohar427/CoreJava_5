package com.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparatorDemo {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Abc", 12);
		Student s2 = new Student("Klm", 102);
		Student s3 = new Student("Rty", 120);
		Student s4 = new Student("Qwe", 812);
		Student s5 = new Student("Bhy", 612);
		Student s6 = new Student("FFg", 912);
		
		
		ArrayList list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		System.out.println("Before Sort:"+list);
		
		Collections.sort(list,new Student_Marks());
		System.out.println("Sort Based Marks:"+list);
		
		Collections.sort(list,new Student_Name());
		System.out.println("Sort Name:"+list);
	}

}


class Student
{
	String namae;
	int marks;
	public Student(String namae, int marks) {
		this.namae = namae;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [namae=" + namae + ", marks=" + marks + "]";
	}
}

class Student_Marks implements Comparator
{
	public int compare(Object ss1, Object ss2) {
		Student s1 = (Student)ss1;
		Student s2 = (Student)ss2;
		return s1.marks-s2.marks;
	}
}

class Student_Name implements Comparator
{
	public int compare(Object ss1, Object ss2) {
		Student s1 = (Student)ss1;
		Student s2 = (Student)ss2;
		return s1.namae.compareTo(s2.namae);
	}
}

