package com.test;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = -5777083593560557722L;
	private String name;
	private String email;
	private String accNum;

	public Customer(String name, String email, String accNum) {
		this.name = name;
		this.email = email;
		this.accNum = accNum;
	}

	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", accNum="
				+ accNum + "]";
	}

}
