package lab_package;

public class Student extends People{
	private String name, specialty;
	private int course, group;
	private Faculty faculty = new Faculty();

	Student() {
		
	}

	public Student(String name, Faculty faculty, String specialty, int course, int group) {
		this.name = name;

		// for(int i=0;i<) {
		//
		// }

		this.faculty = faculty;
		// this.specialty = specialty.sName;
		this.course = course;
		this.group = group;
		// specialty.addStudentsToSpecialty(this);
	}

}
