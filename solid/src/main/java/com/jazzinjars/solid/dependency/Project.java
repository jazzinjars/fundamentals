package com.jazzinjars.solid.dependency;

import java.util.List;

public class Project {

	private List<Developer> developers;

	// So as we can see the Project class is a high level module and it depends on low level modules
	// such as BackEndDeveloper and FrontEndDeveloper. We are actually violating the first part of
	// the dependency inversion principle.
	// ------>
	private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
	private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

	public void implementNoPrinciple() {
//		backEndDeveloper.writeJava();
//		frontEndDeveloper.writeJavaScript();
	}
	// ------>

	public Project(List<Developer> developers) {
		this.developers = developers;
	}

	public void implement() {
		developers.forEach(d -> d.develop());
	}
}


