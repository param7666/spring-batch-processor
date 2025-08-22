package com.nt.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Employee {
	
	private Integer eid;
	private String name;
	private String department;
	private Double salary;
	private LocalDate jdate;
	
	public Employee()
	{
		System.out.println("Employee.Employee()");
	}
}
