package com.Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
	
	public static Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		Map<Employee, String> sorted = new TreeMap<>(originalMap); 
		
		return sorted;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<Employee, String> hm = new HashMap<>();
		
		System.out.println("Enter 5 Employee Detaitls: ");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Employee Id: ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String name = sc.next();
			System.out.println("Enter Employee Salary: ");
			int salary = sc.nextInt();
			System.out.println("Enter Employee Branch: ");
			String branch = sc.next();
			hm.put(new Employee(id,name,salary), branch);
		}
		
		Map<Employee, String> sorted = sortMapUsingEmployeeSalary(hm);
		
		ArrayList<Employee> keys = new ArrayList<> (sorted.keySet());
		ArrayList<String> values = new ArrayList<> (sorted.values());
		
		for(int i=0;i<keys.size();i++) {
			System.out.println(keys.get(i)+" Branch "+values.get(i));
		}
		

	}

}
