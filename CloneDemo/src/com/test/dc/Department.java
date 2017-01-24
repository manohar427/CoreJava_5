package com.test.dc;

public class Department implements Cloneable{
	private String depName;
	private int depNo;

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
