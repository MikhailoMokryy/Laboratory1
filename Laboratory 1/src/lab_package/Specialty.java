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
	
	public void addStudentToStudentsArray(Student student) {
			this.studentArrayUp();
			this.studentArray[this.studentArray.length - 1] = student;
	}
	
	public void createStudent(People people ,Faculty faculty,Specialty specialty) throws IOException{
		System.out.println("Enter the name "+people.oName+":");
		String name = DataInput.getString();

		System.out.println("Enter the curse :");
		int course = DataInput.getInt();

		System.out.println("Enter the number of group :");
		int group = DataInput.getInt();

		Student student = new Student(name, faculty, specialty, course, group);
		addStudentToStudentsArray(student);
	}
}
