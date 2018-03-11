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
	
	public Student(String name) {
		this.name=name;
		this.indicator=1;
		this.oName = "student";
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
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the course
	 */
	public int getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(int course) {
		this.course = course;
	}

	/**
	 * @return the group
	 */
	public int getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(int group) {
		this.group = group;
	}
	
	public String toString() {
		return "Name : "+this.name;
	}

}
