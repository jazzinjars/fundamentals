package com.jazzinjars.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class WorkingApp {

	public static void main(String[] args) throws Exception {
		List<WorkingEmployee> employees = new ArrayList<>();
		employees.add(new WorkingEmployeeImpl());

		Project project = new Project();
		project.start(employees);
	}
}
