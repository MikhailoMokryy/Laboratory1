package lab_package;

import java.io.IOException;

public class FacultyObject {
	String name;
	public int indicator=0;// indicate that this is FacultyObject;
	public String oName ="FacultyObject";
	
	Student[] studentArray = new Student[0];
	Professor[] professorsArray = new Professor[0];
	
	
	public FacultyObject(){
		this.name = "Default";
	}
	
	FacultyObject(String name ){
		this.name  = name ;
	}
	
	private boolean checkPeople(People people){
		boolean result=false;
		if (people.indicator == 1) {
			for (int i = 0; i < this.studentArray.length; i++) {
				boolean equals = DataInput.compareStrings(people.name, this.studentArray[i].name);
				if (equals == true) {
					result = true;
					break;
				}
			}
		}
		else if(people.indicator==2) {
			for (int i = 0; i < this.professorsArray.length; i++) {
				boolean equals = DataInput.compareStrings(people.name, this.professorsArray[i].name);
				if (equals == true) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public void createPeople(People people ,Faculty faculty,FacultyObject facultyObject) throws IOException{
		System.out.println("Enter the name "+people.oName+":");
		String name = DataInput.getString();
		if(people.indicator ==1) {
			System.out.println("Enter the curse :");
			int course = DataInput.getInt();
	
			System.out.println("Enter the number of group :");
			int group = DataInput.getInt();
			Student student = new Student(name, faculty, facultyObject, course, group);
			addStudentToStudentsArray(student);
		}
		else if(people.indicator ==2) {
			Professor s = new Professor(name, faculty, facultyObject);
			
		}
	}
	
	public void deletePeople(People people) throws IOException{
		boolean stop = false;
		System.out.println("Enter the name of "+people.oName+" to delete:");
		people.name = DataInput.getString();
		
		while (checkPeople(people) == false) {
			System.out.println(
					"There is no "+people.oName+" with this name!!!\nTo exit press 0\n\nEnter the name of faculty for deleting : ");
			name = DataInput.getString();
			if (name.charAt(0) == '0') {
				stop = true;
				break;
			}
		}

		if (stop == false) {
			int k = positionInArray(people);
			if(people.indicator==1) {
				if (this.studentArray.length != 0) {
					Student[] copy = new Student[this.studentArray.length - 1];
					for (int i = 0, n = 0; i < this.studentArray.length; i++, n++) {
						if (i != k) {
							copy[n] = this.studentArray[i];
						} else
							n--;
					}
					this.studentArray = new Student[copy.length];
					for (int i = 0; i < copy.length; i++) {
						this.studentArray[i] = copy[i];
					}
				} else
					System.out.println("There is no departments!!!");
			}
			else if(people.indicator==2) {
				if (this.professorsArray.length != 0) {
					Professor[] copy = new Professor[this.professorsArray.length - 1];
					for (int i = 0, n = 0; i < this.professorsArray.length; i++, n++) {
						if (i != k) {
							copy[n] = this.professorsArray[i];
						} else
							n--;
					}
					this.professorsArray = new Professor[copy.length];
					for (int i = 0; i < copy.length; i++) {
						this.professorsArray[i] = copy[i];
					}
				} else
					System.out.println("There is no specialties!!!");
			}
		}
	}
	
	public void editPeople(People people) throws IOException{
		System.out.println("Enter the name of "+people.oName+" to edit :");
		String name = DataInput.getString();
		People copy = people;
		copy.name = name;
		boolean exist  = checkPeople(copy);
		boolean stop=false;
		while(exist==false) {
			System.out.println("There is no "+people.oName+" with this name!!!\nTo exit press 0 \n\nEnter the name of "+people.oName+" to edit :");
			name = DataInput.getString();
			if (name.charAt(0) == '0') {
				stop = true;
				break;
			}
			exist  = checkPeople(copy);
		}
		if(stop ==false && exist==true) {
			System.out.println("New name :");
			String newName = DataInput.getString();
			if(people.indicator==1) {
				this.studentArray[positionInArray(people)].name = newName;
			}
			else if(people.indicator==2) {
				this.professorsArray[positionInArray(people)].name = newName;
			}
			else System.out.println("!!!!Indicator must be only 1 or 2!!!!");
		}
	}
	
	private int positionInArray(People people) {
		int result = 0;
		if(people.indicator==1) {
			for (int i = 0; i < this.studentArray.length; i++) {
				boolean equals = DataInput.compareStrings(people.name, this.studentArray[i].name);
				if (equals == true) {
					result = i;
					break;
				}
			}
		}
		else if(people.indicator==2) {
			for (int i = 0; i < this.professorsArray.length; i++) {
				boolean equals = DataInput.compareStrings(people.name, this.professorsArray[i].name);
				if (equals == true) {
					result = i;
					break;
				}
			}
		}
		return result;
	}
	
	public void studentArrayUp() {
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
			studentArrayUp();
			this.studentArray[this.studentArray.length - 1] = student;
	}
	
	public String toString(People people) {
		String result="";
		if(people.indicator==1) {
			result = "All students : ";
			for(int i=0;i<studentArray.length;i++) {
				result+="\n"+studentArray[i].name;
			}
		}
		else if(people.indicator==2) {
			result = "All professors : ";
			for(int i=0;i<professorsArray.length;i++) {
				result+="\n"+professorsArray[i].name;
			}
		}
		return result;
	}
	
}
