package com.nt.operation;

import org.springframework.batch.item.ItemProcessor;

import com.nt.entity.Employee;

public class EmployeeProccessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee item) throws Exception {
		//Proccess what ever you want
		return item;
	}

}
