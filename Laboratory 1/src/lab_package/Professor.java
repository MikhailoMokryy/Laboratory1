package lab_package;

public class Professor extends People{
	private String name;
	private Faculty faculty = new Faculty();
	private Department department;
	public Professor(){
		name = "";
		this.indificator = 2;
		this.oName = "professor";
	}
	
	public Professor(String name ,Faculty faculty,FacultyObject facultyObject) {
		this.name = name;
		if(facultyObject.indicator== 2) {
			this.faculty = faculty;
			this.department = new Department(faculty.name) ;
		}
	}
}
