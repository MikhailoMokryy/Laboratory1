package lab_package;

public class Student extends People{
	public String name;
	private int course, group;
	private Faculty faculty = new Faculty();
	private Specialty specialty;

	public Student() {
		this.indicator=1;
		this.oName = "student";
	}
	
	public Student(String name,int course,int group) {
		this.name=name;
		this.course = course;
		this.group = group;
	}

	public Student(String name, Faculty faculty, FacultyObject facultyObject, int course, int group) {
		this.indicator=1;
		this.oName = "student";
		this.name = name;
		this.faculty = faculty;
		if(facultyObject.indicator == 2) {
		this.specialty  = new Specialty(facultyObject.name); 
		this.course = course;
		this.group = group;
		}
		else System.out.println("Something went wrong!!!");
	}

	public String toString() {
		return "Name : "+this.name;
	}
}
