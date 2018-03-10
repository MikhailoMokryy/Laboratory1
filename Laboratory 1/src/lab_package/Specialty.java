package lab_package;

import java.io.IOException;

public class Specialty extends FacultyObject{
	Student[] studentArray = new Student[0];
	
	public Specialty() {
		this.indicator =2;// indicate that this object is specialty;
		this.oName = "Specialty";
	}

	public Specialty(String name) {
		this.indicator =2;// indicate that this object is specialty;
		this.oName = "Specialty";
		this.name = name;
	}
}
