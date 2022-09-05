package com.Q1;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String name;
	private int salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id , String name, int salary) {
		// TODO Auto-generated constructor stub
		this.setEmpId(id);
		this.setName(name);
		this.setSalary(salary);
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int s1 = this.getSalary();
		int s2 = o.getSalary();
		if(s1>s2) {
			return +1;
			
		}else if (s1<s2) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	


}
