package lab_package;

import java.io.IOException;



public class FacultyObject {
	String name;
	public int indicator=0;// indicate that this is FacultyObject;
	public String oName ="FacultyObject";
	private int checkCourse,checkGroup;
	
	Student[] studentArray = new Student[0];
	Professor[] professorsArray = new Professor[0];
	
	
	public FacultyObject(){
		this.name = "Default";
	}
	
	FacultyObject(String name ){
		this.name  = name ;
	}
	
	/**method  check if student or professor exist*/
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
	
	/**method create student or professor*/
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
	
	
	/**method delete student or professor*/
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
	
	
	/**method edit student or professor*/
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
	
	/**method find position of array element*/
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
	
	/**method increase student array*/
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
	
	/**method increase professor array*/
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
	
	/**method add professor to professor array*/
	public void addProfessorToProfessorsArray(Professor professor) {
		this.professorArrayUp();
		this.professorsArray[this.professorsArray.length - 1] = professor;
	}
	
	/**method add student to student array*/
	public void addStudentToStudentsArray(Student student) {
			studentArrayUp();
			this.studentArray[this.studentArray.length - 1] = student;
	}
	
	
	/**method sort all  students in alphabetical order*/
	private void sortStudentsArray() {
		 
		int k =0;
		for (int i = 0; i < studentArray.length; i++) {
			char min = studentArray[i].name.charAt(k);
			int min_i = i;
			for (int j = i+1; j < studentArray.length; j++) {
				
				while (studentArray[j].name.charAt(k) == min) {
					k++;
					min = studentArray[i].name.charAt(k);
				}
				 if (studentArray[j].name.charAt(k) < min) {
					min = studentArray[j].name.charAt(k);
					min_i = j;
				}
				 k=0;
			}
			
			if (i != min_i) {
				String str = studentArray[i].name;
 				studentArray[i].name = studentArray[min_i].name;
				studentArray[min_i].name = str;
			
		      }
		}
	}
	
	/**method sort student by course*/
	private void sortStudentsArrayByCourse() {
		for (int i = 0; i < studentArray.length; i++) {
			int min = Integer.valueOf(studentArray[i].course);
			int min_i = i;
			for (int j = i + 1; j < studentArray.length; j++) {
				if (Integer.valueOf(studentArray[j].course) < min) {
					min = Integer.valueOf(studentArray[j].course);
					min_i = j;
				}
			}
			if (i != min_i) {
				int tmp =studentArray[i].course;
				studentArray[i].course = studentArray[min_i].course;
				studentArray[min_i].course = tmp;

				String str = studentArray[i].name;
 				studentArray[i].name = studentArray[min_i].name;
				studentArray[min_i].name = str;
			}
		}
	}
	
	
	/**method sort student array by group*/
	private void sortStudentsArrayByGroup() {
		for (int i = 0; i < studentArray.length; i++) {
			int min = Integer.valueOf(studentArray[i].group);
			int min_i = i;
			for (int j = i + 1; j < studentArray.length; j++) {
				if (Integer.valueOf(studentArray[j].group) < min) {
					min = Integer.valueOf(studentArray[j].group);
					min_i = j;
				}
			}
			if (i != min_i) {
				int tmp =studentArray[i].group;
				studentArray[i].group= studentArray[min_i].group;
				studentArray[min_i].group = tmp;

				String str = studentArray[i].name;
 				studentArray[i].name = studentArray[min_i].name;
				studentArray[min_i].name = str;
			}
		}
	}
	
	
	/**method sort professors array in alphabetical order*/
	private void sortProfessorsArray() {
		int k =0;
		for (int i = 0; i < professorsArray.length; i++) {
			char min = professorsArray[i].name.charAt(k);
			int min_i = i;
			for (int j = i+1; j < professorsArray.length; j++) {
				
				while(professorsArray[j].name.charAt(k) == min) {
					k++;
					min = professorsArray[i].name.charAt(k);
				}
				 if (professorsArray[j].name.charAt(k) < min) {
					min = professorsArray[j].name.charAt(k);
					min_i = j;
				}
				 k=0;
			}
			
			if (i != min_i) {
				String str = professorsArray[i].name;
				professorsArray[i].name = professorsArray[min_i].name;
				professorsArray[min_i].name = str;
			
		      }
		}
	}
	
	
	/**return string of student of input group and faculty*/
	public String toStringAdv(People people) {
		String result="";
		if(people.indicator==1) {
			result = "Elected students: ";
			for(int i=0;i<studentArray.length;i++) {
				if(studentArray[i].course==2&&studentArray[i].group==2) //работает только с интами checkCourse и checkGroup не работает class Arrays 298
				result+="\n"+studentArray[i].name+ "  course: "+studentArray[i].course+ "  group: "+studentArray[i].group ;
			}
		}
		return result;
	}
	
	
	/**return string of student in increasing order*/
	public String toStringInOrder(People people,boolean check) {
		String result="";
			result = "All students in increasing order: ";
			if(check == false) {
				sortStudentsArrayByGroup();
				for(int i=0;i<studentArray.length;i++) {
					result+="\n"+studentArray[i].name+ " group: "+studentArray[i].group;
				}
			}else {
			sortStudentsArrayByCourse();
			for(int i=0;i<studentArray.length;i++) {
				result+="\n"+studentArray[i].name+ " course: "+studentArray[i].course;
			}
		}
		
		return result;
	}
	
	public String toString(People people) {
		String result="";
		if(people.indicator==1) {
			result = "All students: ";
			sortStudentsArray();
			for(int i=0;i<studentArray.length;i++) {
				result+="\n"+studentArray[i].name;
			}
		}
		else if(people.indicator==2) {
			result = "All professors: ";
			sortProfessorsArray();
			for(int i=0;i<professorsArray.length;i++) {
				result+="\n"+professorsArray[i].name;
			}
		}
		return result;
	}

	/**
	 * @param checkCourse the checkCourse to set
	 */
	public void setCheckCourse(int checkCourse) {
		this.checkCourse = checkCourse;
	}

	/**
	 * @param checkGroup the checkGroup to set
	 */
	public void setCheckGroup(int checkGroup) {
		this.checkGroup = checkGroup;
	}

	/**
	 * @return the checkCourse
	 */
	public int getCheckCourse() {
		return checkCourse;
	}

	/**
	 * @return the checkGroup
	 */
	public int getCheckGroup() {
		return checkGroup;
	}

	
}
