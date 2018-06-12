package com.jazzinjars.solid.liskov;

import java.util.List;

public class Project {

//	public void start(List<Employee> employees) {
//		for (Employee employee : employees) {
//			employee.work();
//		}
//	}

	public void start(List<WorkingEmployee> workingEmployees) {
		for (WorkingEmployee workingEmployee : workingEmployees) {
			workingEmployee.work();
		}
	}
}
