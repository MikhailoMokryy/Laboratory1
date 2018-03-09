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
	}
	
	public void createProfessor(People people ,Faculty faculty,Department department) throws IOException{
		System.out.println("Enter the name of professor :");
		String name = DataInput.getString();
		Professor s = new Professor(name, faculty, department);
	}
}
