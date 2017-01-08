package com.test.map;

import java.util.HashMap;

public class MapKeyDemo {

	public static void main(String[] args) {
		/*HashMap hm = new HashMap();

		Student s1 = new Student("Abc", 24);
		Student s2 = new Student("Abc", 24);
		Student s3 = new Student("Pqr", 24);
		hm.put(s1, "Std1");
		hm.put(s2, "Std2");
		hm.put(s3, "Std3");

		System.out.println(hm);*/
		
		
		HashMap hm2 = new HashMap();

		hm2.put("Abc", "Std1");
		hm2.put("Abc", "Std2");
		hm2.put("Pqr", "Std3");

		System.out.println("Second HM:"+hm2);
	}

}

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}