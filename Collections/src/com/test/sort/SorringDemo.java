package com.test.sort;

import java.util.TreeSet;

public class SorringDemo {

	
	public static void main(String[] args) {
		
		Student s1 = new Student("Abc", 12);
		Student s2 = new Student("Klm", 102);
		Student s3 = new Student("Rty", 120);
		Student s4 = new Student("Qwe", 812);
		Student s5 = new Student("Bhy", 612);
		Student s6 = new Student("FFg", 912);
		//Student all[] = {s1,s2,s3,s4,s5,s6};
		
		TreeSet set = new TreeSet();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		System.out.println(set);
	}

}

class Student implements Comparable
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
	
	public int compareTo(Object arg0) {
		Student s = (Student)arg0;
		//return -(this.marks-s.marks);
		return -(this.namae.compareTo(s.namae));
	}
}


