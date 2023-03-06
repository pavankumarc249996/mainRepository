package com.pavan.model;

public class Employee {
	//Eager instantiation
	//public static Employee employee = null;
	private int empId;
	private String empName;
	private String Loc;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Employee() {

	}

	private Employee(int empId, String empName, String loc) {
		super();
		this.empId = empId;
		this.empName = empName;
		Loc = loc;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Loc=" + Loc + ", address=" + address + "]";
	}

	
}
