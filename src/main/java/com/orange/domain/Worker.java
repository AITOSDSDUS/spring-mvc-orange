package com.orange.domain;

public class Worker {
	
	private int workerId;
	private String firstName;
	private String lastName;
	private float salary;
	private int departmentId;
	private int role;
	
	public Worker() {
		this.firstName = "";
		this.lastName = "";
		this.salary = 0;
		this.departmentId = -1;
		this.role = -1;
	}
	
	public Worker(int workerId, String firstName, String lastName, float salary, int departmentId, int role) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.departmentId = departmentId;
		this.role = role;
	}
	
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	
}
