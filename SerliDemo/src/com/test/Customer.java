package com.test;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -5777083593560557722L;
	String name;
	String email;
	String accNum;
	static String password = "777";
	transient String ssnNum = "0000";

	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", accNum="
				+ accNum + ", ssnNum=" + ssnNum + ",password=" + password + "]";
	}

}
