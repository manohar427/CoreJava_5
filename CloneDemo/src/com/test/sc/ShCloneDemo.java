package com.test.sc;

public class ShCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp = new Employee();
		emp.setName("Abc");
		emp.setEmpId(1234);
		
		Department dep = new Department();
		dep.setDepName("Admin");
		dep.setDepNo(100);
		
		emp.setDept(dep);
		
		Employee clone = (Employee)emp.clone();
		
		clone.getDept().setDepName("Manager");
		
		
		System.out.println("Original Name:"+emp.getDept().getDepName());
	}
}

class Employee implements Cloneable
{
	String name;
	int empId;
	Department dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}