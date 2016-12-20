package com.test;

public class Person {

	String name;
	String email;
	int perosnid;
	
	public Person(String name, String email, int perosnid) {
		this.name = name;
		this.email = email;
		this.perosnid = perosnid;
	}

	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", perosnid="
				+ perosnid + "]";
	}
	
	
}
