package lab_package;

public class Student extends People{
	private String name;
	private int course, group;
	private Faculty faculty = new Faculty();
	private Specialty specialty;

	public Student() {
		this.indificator=1;
		this.oName = "student";
	}

	public Student(String name, Faculty faculty, Specialty specialty, int course, int group) {
		this.name = name;
		this.faculty = faculty;
		this.specialty = specialty;
		this.course = course;
		this.group = group;
	}

}
