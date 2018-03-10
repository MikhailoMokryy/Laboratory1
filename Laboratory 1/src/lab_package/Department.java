package lab_package;

import java.io.IOException;

public class Department extends FacultyObject{
	Professor[] professorsArray = new Professor[0];
	
	public Department() {
		this.name = "Default";
		this.indicator = 1;
		this.oName = "Department";
	}
	
	public Department(String name) {
		this.name = name;
		this.indicator = 1;
		this.oName = "Department";
	}
}
