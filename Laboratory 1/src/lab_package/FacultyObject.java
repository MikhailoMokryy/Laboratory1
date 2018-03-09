package lab_package;

import java.io.IOException;

public class FacultyObject {
	String name;
	public int indicator=0;// indicate that this is FacultyObject;
	public String oName ="FacultyObject";
	
	Student[] studentArray = new Student[0];
	Professor[] professorsArray = new Professor[0];
	
	
	FacultyObject(){
		this.name = "Default";
	}
	
	FacultyObject(String name ){
		this.name  = name ;
	}
	
	public void createPeople(People people ,Faculty faculty,FacultyObject facultyObject) throws IOException{
		System.out.println("Enter the name "+people.oName+":");
		String name = DataInput.getString();
		if(people.indificator ==1) {
			System.out.println("Enter the curse :");
			int course = DataInput.getInt();
	
			System.out.println("Enter the number of group :");
			int group = DataInput.getInt();
			Student student = new Student(name, faculty, facultyObject, course, group);
			addStudentToStudentsArray(student);
		}
		else if(people.indificator ==2) {
			Professor s = new Professor(name, faculty, facultyObject);
			
		}
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
	
	private void professorArrayUp() {
		int len = professorsArray.length;
		Professor[] copy = new Professor[len];
		for (int i = 0; i < len; i++) {
			copy[i] = professorsArray[i];
		}
		professorsArray = new Professor[len + 1];
		for (int i = 0; i < len; i++) {
			professorsArray[i] = copy[i];
		}
	}
	
	public void addProfessorToProfessorsArray(Professor professor) {
		this.professorArrayUp();
		this.professorsArray[this.professorsArray.length - 1] = professor;
	}
	
	public void addStudentToStudentsArray(Student student) {
			this.studentArrayUp();
			this.studentArray[this.studentArray.length - 1] = student;
	}
	
	public String toString(People people) {
		String result="";
		if(people.indificator==1) {
			result = "All students : ";
			for(int i=0;i<studentArray.length;i++) {
				result+="\n"+studentArray[i];
			}
		}
		else if(people.indificator==2) {
			result = "All professor : ";
			for(int i=0;i<professorsArray.length;i++) {
				result+="\n"+professorsArray[i];
			}
		}
		return result;
	}
	
}
