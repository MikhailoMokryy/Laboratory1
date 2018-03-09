package lab_package;

import java.io.IOException;

public class Specialty extends FacultyObject{
	Student[] studentArray = new Student[0];
	
	public Specialty() {
		this.indicator =2;// indicate that this object is specialty;
		this.oName = "Specialty";
	}

	public Specialty(String name) {
		this.name = name;
	}

	public void addStudentsToSpecialty(Student first) {
		this.studentArrayUp();
		this.studentArray[this.studentArray.length - 1] = first;
	}

	private void studentArrayUp() {
		int len = studentArray.length;
		Student[] copy = new Student[len];
		for (int i = 0; i < len; i++) {
			copy[i] = studentArray[i];
		}
		studentArray = new Student[len + 1];
		for (int i = 0; i < len; i++) {
			studentArray[i] = copy[i];
		}

	}
	
	public void createStudent(People people ,Faculty faculty,Specialty specialty) throws IOException{
		System.out.println("Enter the name "+people.oName+":");
		String name = DataInput.getString();

		System.out.println("Enter the curse :");
		int course = DataInput.getInt();

		System.out.println("Enter the number of group :");
		int group = DataInput.getInt();

		Student s = new Student(name, faculty, specialty, course, group);

	}
}
