package com.test.dc;

public class ShCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee();
		emp.setName("Abc");
		emp.setEmpId(1234);

		Department dep = new Department();
		dep.setDepName("Admin");
		dep.setDepNo(100);

		emp.setDept(dep);

		Employee clone1 = (Employee) emp.clone();
		Employee clone2 = (Employee) emp.clone();
		Employee clone3 = (Employee) emp.clone();
		Employee clone4 = (Employee) emp.clone();
		Employee clone5 = (Employee) emp.clone();

		clone1.getDept().setDepName("Manager");

		System.out.println("Colned Dept Name:" + clone1.getDept().getDepName());
		System.out.println("Original Dept Name:" + emp.getDept().getDepName());
	}
}

class Employee implements Cloneable {
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
		Employee emp = (Employee) super.clone();
		Department dep = (Department) emp.getDept().clone();
		emp.setDept(dep);
		return emp;
	}
}