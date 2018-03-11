package lab_package;

import java.io.IOException;

public class Arrays {
	public Faculty[] facultiesArray;
	private int course,group;
	

	public Arrays() {
		this.facultiesArray = new Faculty[0];
		Faculty fi = new Faculty("FI");
		setFacultyToAray(fi);
			Specialty fiSpec1 = new Specialty("SE");
			facultiesArray[0].addFacultyObjectToFaculty(fiSpec1, fiSpec1.name);
				Student s01 = new Student("Victor Alekseev",facultiesArray[0],facultiesArray[0].specialtyArray[0],2,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s01);
				Student s02 = new Student("Kirill Artemyev",facultiesArray[0],facultiesArray[0].specialtyArray[0],2,3);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s02);
				Student s03 = new Student("Georgiy Kulikov",facultiesArray[0],facultiesArray[0].specialtyArray[0],1,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s03);
				Student s04 = new Student("Mikhail Orekhov",facultiesArray[0],facultiesArray[0].specialtyArray[0],3,4);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s04);
				Student s05 = new Student("Kirill Platunov",facultiesArray[0],facultiesArray[0].specialtyArray[0],1,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s05);
				Student s06 = new Student("Pakhom Afanasyev",facultiesArray[0],facultiesArray[0].specialtyArray[0],3,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s06);
				Student s07 = new Student("Vitaly Makarov",facultiesArray[0],facultiesArray[0].specialtyArray[0],5,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s07);
				Student s08 = new Student("Ivan Suvorov",facultiesArray[0],facultiesArray[0].specialtyArray[0],2,3);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s08);
				Student s09 = new Student("Ekaterina Bulgakova",facultiesArray[0],facultiesArray[0].specialtyArray[0],1,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s09);
				Student s010 = new Student("Alina Volkova",facultiesArray[0],facultiesArray[0].specialtyArray[0],1,2);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s010);
				Student s011 = new Student("Valerya Soboleva",facultiesArray[0],facultiesArray[0].specialtyArray[0],2,2);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(s011);
						
				Specialty fiSpec2 = new Specialty("AM");
			    facultiesArray[0].addFacultyObjectToFaculty(fiSpec2, fiSpec2.name);
				Student s11 = new Student("Alina Bolshakova",facultiesArray[0],facultiesArray[0].specialtyArray[1],1,1);
				facultiesArray[0].specialtyArray[1].addStudentToStudentsArray(s11);
				Student s12 = new Student("Evgenia Zimina",facultiesArray[0],facultiesArray[0].specialtyArray[1],1,1);
				facultiesArray[0].specialtyArray[1].addStudentToStudentsArray(s12);
				Student s13 = new Student("Irina Belyaeva",facultiesArray[0],facultiesArray[0].specialtyArray[1],1,1);
				facultiesArray[0].specialtyArray[1].addStudentToStudentsArray(s13);
				Student s14 = new Student("Anton Vishnyakov",facultiesArray[0],facultiesArray[0].specialtyArray[1],1,1);
				facultiesArray[0].specialtyArray[1].addStudentToStudentsArray(s14);
				Student s15 = new Student("Andrey Terentyev",facultiesArray[0],facultiesArray[0].specialtyArray[1],1,1);
				facultiesArray[0].specialtyArray[1].addStudentToStudentsArray(s15);
				
				Specialty fiSpec3 = new Specialty("CS");
				facultiesArray[0].addFacultyObjectToFaculty(fiSpec3, fiSpec3.name);
			    Student s21 = new Student("Vadim Koshelev",facultiesArray[0],facultiesArray[0].specialtyArray[2],1,1);
				facultiesArray[0].specialtyArray[2].addStudentToStudentsArray(s21);
				Student s22 = new Student("Kostya Gromov",facultiesArray[0],facultiesArray[0].specialtyArray[2],1,1);
				facultiesArray[0].specialtyArray[2].addStudentToStudentsArray(s22);
				Student s23 = new Student("Grigory Bolshakov",facultiesArray[0],facultiesArray[0].specialtyArray[2],1,1);
				facultiesArray[0].specialtyArray[2].addStudentToStudentsArray(s23);
				Student s24 = new Student("Ibrahim Pavlov",facultiesArray[0],facultiesArray[0].specialtyArray[2],1,1);
				facultiesArray[0].specialtyArray[2].addStudentToStudentsArray(s24);
				Student s25 = new Student("Katerina Molchanova",facultiesArray[0],facultiesArray[0].specialtyArray[2],1,1);
				facultiesArray[0].specialtyArray[2].addStudentToStudentsArray(s25);
				
					
				    Department d_math = new Department("Department of Math");
				    facultiesArray[0].addFacultyObjectToFaculty(d_math,d_math.name);
				    Professor p01 = new Professor("Dyachenko Sergey Nikolaevich",facultiesArray[0],facultiesArray[0].departmentArray[0]);
				    facultiesArray[0].departmentArray[0].addProfessorToProfessorsArray(p01);
				    Professor p02 = new Professor("Mitnik Yuri Vasilyevich",facultiesArray[0],facultiesArray[0].departmentArray[0]);
				    facultiesArray[0].departmentArray[0].addProfessorToProfessorsArray(p02);
				    Professor p03 = new Professor("Rusev Andrey Valerievich",facultiesArray[0],facultiesArray[0].departmentArray[0]);
				    facultiesArray[0].departmentArray[0].addProfessorToProfessorsArray(p03);
				     
				    Department d_nt = new Department("Department of Network Technologies");
				    facultiesArray[0].addFacultyObjectToFaculty(d_nt,d_nt.name);
				    Professor p11 = new Professor("Franchuk Oleg Vasilievich",facultiesArray[0],facultiesArray[0].departmentArray[1]);
				    facultiesArray[0].departmentArray[1].addProfessorToProfessorsArray(p11);
				    Professor p12 = new Professor("Glibovets Andrey Nikolaevich",facultiesArray[0],facultiesArray[0].departmentArray[1]);
				    facultiesArray[0].departmentArray[1].addProfessorToProfessorsArray(p12);
				    Professor p13 = new Professor("Cherkasov Dmitry Ivanovich",facultiesArray[0],facultiesArray[0].departmentArray[1]);
				    facultiesArray[0].departmentArray[1].addProfessorToProfessorsArray(p13);
				    Professor p14 = new Professor("Sinitsina Rinata Borisovna",facultiesArray[0],facultiesArray[0].departmentArray[1]);
				    facultiesArray[0].departmentArray[1].addProfessorToProfessorsArray(p14);
				    
				    Department d_ms = new Department("Department of Multimedia Systems");
				    facultiesArray[0].addFacultyObjectToFaculty(d_ms,d_ms.name);
				    Professor p21 = new Professor("Bublik Vladimir Vasilevich",facultiesArray[0],facultiesArray[0].departmentArray[2]);
				    facultiesArray[0].departmentArray[2].addProfessorToProfessorsArray(p21);
				    Professor p22 = new Professor("Afonin Andrey Nikolaevich",facultiesArray[0],facultiesArray[0].departmentArray[2]);
				    facultiesArray[0].departmentArray[2].addProfessorToProfessorsArray(p22);
				    Professor p23 = new Professor("Zhezherun Oleksandr Petrovich",facultiesArray[0],facultiesArray[0].departmentArray[2]);
				    facultiesArray[0].departmentArray[2].addProfessorToProfessorsArray(p23);
				    Professor p24 = new Professor("Pechkurova Olena Nikolaevna",facultiesArray[0],facultiesArray[0].departmentArray[2]);
				    facultiesArray[0].departmentArray[2].addProfessorToProfessorsArray(p24);
				    
				    Department d_i = new Department("Department of Informatics");
				    facultiesArray[0].addFacultyObjectToFaculty(d_i,d_i.name);
				    Professor p31 = new Professor("Kirienko Oksana Valentinovna",facultiesArray[0],facultiesArray[0].departmentArray[3]);
				    facultiesArray[0].departmentArray[3].addProfessorToProfessorsArray(p31);
				    Professor p32 = new Professor("Glibovets Nikolay Nikolayevich",facultiesArray[0],facultiesArray[0].departmentArray[3]);
				    facultiesArray[0].departmentArray[3].addProfessorToProfessorsArray(p32);
				    Professor p33 = new Professor("Protsenko Vladimir Semenovich",facultiesArray[0],facultiesArray[0].departmentArray[3]);
				    facultiesArray[0].departmentArray[3].addProfessorToProfessorsArray(p33);
				     
				     
		Faculty fen = new Faculty("FEN");
		setFacultyToAray(fen);
		Faculty fgn = new Faculty("FGN");
		setFacultyToAray(fgn);
		
		
		
	}

	public void setFacultyToAray(Faculty first) {
		this.facultiesArrayUp();
		this.facultiesArray[this.facultiesArray.length - 1] = first;
	}

	private void facultiesArrayUp() {
		int len = this.facultiesArray.length;
		Faculty[] copy = new Faculty[len];
		for (int i = 0; i < len; i++) {
			copy[i] = this.facultiesArray[i];
		}
		this.facultiesArray = new Faculty[len + 1];
		for (int i = 0; i < len; i++) {
			this.facultiesArray[i] = copy[i];
		}
	}
	
	/**Giving the index of faculty with the specified name
	 * !!!But name should exist in array!!!
	 * */
	public int positionInArray(String name) {
		int result = 0;
		for (int i = 0; i < this.facultiesArray.length; i++) {
			boolean equals = DataInput.compareStrings(name, this.facultiesArray[i].name);
			if (equals == true) {
				result = i;
				break;
			}
		}
		return result;
	}
	

	public void facultyCreate() throws IOException {
	System.out.println("Enter the name of new faculty : ");
	String facultyN = DataInput.getString();
	Faculty f = new Faculty(facultyN);
	setFacultyToAray(f);
	}

	
	public void facultyDelete() throws IOException {
		boolean stop = false;
		System.out.println("Enter the name of faculty for deleting : ");
		String df = DataInput.getString();
		Faculty faculty = checkAndSetFaculty(df);

		while (faculty == null) {
			System.out.println(
					"There is no faculty with this name!!!\nTo exit press 0\n\nEnter the name of faculty for deleting : ");
			df = DataInput.getString();
			if (df.charAt(0) == '0') {
				stop = true;
				break;
			}
			faculty = checkAndSetFaculty(df);
		}

		if (stop == false && faculty != null) {
			int k = positionInArray(df);
			if (this.facultiesArray.length != 0) {
				Faculty[] copy = new Faculty[this.facultiesArray.length - 1];
				for (int i = 0, n = 0; i < this.facultiesArray.length; i++, n++) {
					if (i != k) {
						copy[n] = this.facultiesArray[i];
					} else
						n--;
				}
				this.facultiesArray = new Faculty[copy.length];
				for (int i = 0; i < copy.length; i++) {
					this.facultiesArray[i] = copy[i];
				}
			} else
				System.out.println("There is no faculties!!!");
		}
	}
	
	
	public void facultyEdit() throws IOException{
		System.out.println("Enter the name of Faculty to edit :");
		String name = DataInput.getString();
		
		Faculty faculty = checkAndSetFaculty(name);
		boolean stop=false;
		while(faculty==null) {
			System.out.println("There is no faculty with this name!!!\nTo exit press 0 \n\nEnter the name of Faculty to edit :");
			name = DataInput.getString();
			if (name.charAt(0) == '0') {
				stop = true;
				break;
			}
			faculty = checkAndSetFaculty(name);
		}
		if(stop ==false && faculty!=null) {
			System.out.println("New name :");
			String newName = DataInput.getString();
			facultiesArray[positionInArray(name)] = new Faculty(newName);
		}
	}
	

	/**
	 * Check if there is present faculty with such name and if result is true then
	 * return this faculty
	 */

	public Faculty checkAndSetFaculty(String name) {
		Faculty result = null;
		for (int i = 0; i < this.facultiesArray.length; i++) {
			boolean equals = DataInput.compareStrings(name, this.facultiesArray[i].name);
			if (equals == true) {
				result = this.facultiesArray[i];
				break;
			}
		}
		return result;
	}
	
	public boolean checkFaculty(String name) throws IOException{
		boolean result=false;
		boolean stop = false;
		for (int i = 0; i < this.facultiesArray.length; i++) {
			boolean equals = DataInput.compareStrings(name, this.facultiesArray[i].name);
			if (equals == true) {
				result = true;
				break;
			}
		}
		while(result == false && stop!=true) {
			System.out.println("There is no faculty with this name!!!\nTo exit press 0\n\nEnter the name of Faculty to edit :");
			name = DataInput.getString();
			if (name.charAt(0) == '0') {
				stop = true;
				result = false;
				break;
			}
			for (int i = 0; i < this.facultiesArray.length; i++) {
				boolean equals = DataInput.compareStrings(name, this.facultiesArray[i].name);
				if (equals == true) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	
	
	/**Work with students and professors*/
	
	public void showPeople(People people,int flag) throws IOException{
		boolean stop=false;
		System.out.println("Enter the faculty of "+people.oName+" : ");
		String facStr = DataInput.getString();
		Faculty faculty2 = checkAndSetFaculty(facStr);
		while(faculty2==null) {
			System.out.println("There is no such faculty!!!\nPress 0 to exit \n\nEnter the faculty of "+people.oName+" : ");
			facStr = DataInput.getString();
			if(facStr.charAt(0)=='0') {
				stop=true;
				break;
			}
			faculty2 = checkAndSetFaculty(facStr);
		}
		if(stop == false) {
			int k = positionInArray(faculty2.name);
			boolean stop2=false;
			FacultyObject facultyObject;
			if(people.indicator == 2) {
				
				System.out.println("Enter the department : ");
				String depName = DataInput.getString();
				facultyObject = new Department(depName);
			}
			else {
				System.out.println("Enter the specialty: ");
				String specName = DataInput.getString();
				facultyObject = new Specialty(specName);
	          
				
				if(flag ==  1) {
				System.out.println("Enter the course: ");  
				course  = DataInput.getInt();
				facultyObject.setCheckCourse(course);
				System.out.println("Enter the group: ");
				group = DataInput.getInt();
				facultyObject.setCheckGroup(group);
				}
				
			}
			while(facultiesArray[k].checkFacultyObject(facultyObject) == false) {
					System.out.println("There is no such "+facultyObject.oName+"!!!\nPress 0 to exit \n\nEnter the "+facultyObject.oName+" of "+people.oName+" : ");
					String specDepName =DataInput.getString();
					if(specDepName.charAt(0)=='0') {
						stop2=true;
						break;
					}
					if(people.indicator==1) {
						facultyObject = new Specialty(specDepName);
					}	
					else if(people.indicator==2) {
						facultyObject = new Department(specDepName);
					}
			}
			if(stop2!=true) {
				int num=facultiesArray[k].positionInArray(facultyObject);
				if(facultyObject.indicator ==1) {
						System.out.println(facultiesArray[k].departmentArray[num].toString(people));
				}
				else if(facultyObject.indicator ==2) {
					if(flag==1) 
					System.out.println(facultiesArray[k].specialtyArray[num].toStringAdv(people));
					else if(flag==2)
						System.out.println(facultiesArray[k].specialtyArray[num].toStringInOrder(people,true));	
					else if(flag==3)
						System.out.println(facultiesArray[k].specialtyArray[num].toStringInOrder(people,false));
					else if(flag==0)
					System.out.println(facultiesArray[k].specialtyArray[num].toString(people));
				}
			}
		}
		flag=0;
	
	}

	
	public void createPeople(People people) throws IOException{
		boolean stop = false;
		System.out.println("Enter the faculty of "+people.oName+" : ");
		String facStr = DataInput.getString();
		Faculty faculty = checkAndSetFaculty(facStr);
		while(faculty==null) {
			System.out.println("There is no such faculty!!!\nPress 0 to exit \n\nEnter the faculty of "+people.oName+" : ");
			facStr = DataInput.getString();
			if(facStr.charAt(0)=='0') {
				stop=true;
				break;
			}
			faculty = checkAndSetFaculty(facStr);
		}
		if(stop!=true && faculty!=null) {
			int k = positionInArray(facStr);
			FacultyObject facultyObject = new FacultyObject();
			if(people.indicator == 2) {
				System.out.println("Enter the department : ");
				String depName = DataInput.getString();
				facultyObject = new Department(depName);
			}
			else if(people.indicator==1) {
				System.out.println("Enter the specialty : ");
				String specName = DataInput.getString();
				facultyObject = new Specialty(specName);
				System.out.println(""+facultyObject.oName);
			}
			while(facultiesArray[k].checkFacultyObject(facultyObject) == false) {
					System.out.println("There is no such "+facultyObject.oName+"!!!\nPress 0 to exit \n\nEnter the "+facultyObject.oName+" of "+people.oName+" : ");
					String specDepName =DataInput.getString();
					if(specDepName.charAt(0)=='0') {
						stop=true;
						break;
					}
					if(people.indicator==1) {
						facultyObject = new Specialty(specDepName);
					}	
					else if(people.indicator==2) {
						facultyObject = new Department(specDepName);
					}
			}
			if(stop!=true) {
				int num=facultiesArray[k].positionInArray(facultyObject);
					if(facultyObject.indicator ==1) {
						facultiesArray[k].departmentArray[num].createPeople(people,faculty,facultyObject);
					}
					else if(facultyObject.indicator ==2) {
						facultiesArray[k].specialtyArray[num].createPeople(people,faculty,facultyObject);
					}
			}
		}
	}
	
	public void deletePeople(People people) throws IOException{
		boolean stop = false;
		System.out.println("Enter the faculty of "+people.oName+" : ");
		String facStr = DataInput.getString();
		Faculty faculty = checkAndSetFaculty(facStr);
		while(faculty==null) {
			System.out.println("There is no such faculty!!!\nPress 0 to exit \n\nEnter the faculty of "+people.oName+" : ");
			facStr = DataInput.getString();
			if(facStr.charAt(0)=='0') {
				stop=true;
				break;
			}
			faculty = checkAndSetFaculty(facStr);
		}
		if(stop!=true && faculty!=null) {
			int k = positionInArray(facStr);
			FacultyObject facultyObject = new FacultyObject();
			if(people.indicator == 2) {
				System.out.println("Enter the department : ");
				String depName = DataInput.getString();
				facultyObject = new Department(depName);
			}
			else if(people.indicator==1) {
				System.out.println("Enter the specialty : ");
				String specName = DataInput.getString();
				facultyObject = new Specialty(specName);
				System.out.println(""+facultyObject.oName);
			}
			while(facultiesArray[k].checkFacultyObject(facultyObject) == false) {
					System.out.println("There is no such "+facultyObject.oName+"!!!\nPress 0 to exit \n\nEnter the "+facultyObject.oName+" of "+people.oName+" : ");
					String specDepName =DataInput.getString();
					if(specDepName.charAt(0)=='0') {
						stop=true;
						break;
					}
					if(people.indicator==1) {
						facultyObject = new Specialty(specDepName);
					}	
					else if(people.indicator==2) {
						facultyObject = new Department(specDepName);
					}
			}
			if(stop!=true) {
				int num=facultiesArray[k].positionInArray(facultyObject);
					if(facultyObject.indicator ==1) {
						facultiesArray[k].departmentArray[num].deletePeople(people);
					}
					else if(facultyObject.indicator ==2) {
						facultiesArray[k].specialtyArray[num].deletePeople(people);
					}
			}
		}
	}
	
	public void editPeople(People people) throws IOException{
		boolean stop = false;
		System.out.println("Enter the faculty of "+people.oName+" : ");
		String facStr = DataInput.getString();
		Faculty faculty = checkAndSetFaculty(facStr);
		while(faculty==null) {
			System.out.println("There is no such faculty!!!\nPress 0 to exit \n\nEnter the faculty of "+people.oName+" : ");
			facStr = DataInput.getString();
			if(facStr.charAt(0)=='0') {
				stop=true;
				break;
			}
			faculty = checkAndSetFaculty(facStr);
		}
		if(stop!=true && faculty!=null) {
			int k = positionInArray(facStr);
			FacultyObject facultyObject = new FacultyObject();
			if(people.indicator == 2) {
				System.out.println("Enter the department : ");
				String depName = DataInput.getString();
				facultyObject = new Department(depName);
			}
			else if(people.indicator==1) {
				System.out.println("Enter the specialty : ");
				String specName = DataInput.getString();
				facultyObject = new Specialty(specName);
				System.out.println(""+facultyObject.oName);
			}
			while(facultiesArray[k].checkFacultyObject(facultyObject) == false) {
					System.out.println("There is no such "+facultyObject.oName+"!!!\nPress 0 to exit \n\nEnter the "+facultyObject.oName+" of "+people.oName+" : ");
					String specDepName =DataInput.getString();
					if(specDepName.charAt(0)=='0') {
						stop=true;
						break;
					}
					if(people.indicator==1) {
						facultyObject = new Specialty(specDepName);
					}	
					else if(people.indicator==2) {
						facultyObject = new Department(specDepName);
					}
			}
			if(stop!=true) {
				int num=facultiesArray[k].positionInArray(facultyObject);
					if(facultyObject.indicator ==1) {
						facultiesArray[k].departmentArray[num].editPeople(people);
					}
					else if(facultyObject.indicator ==2) {
						facultiesArray[k].specialtyArray[num].editPeople(people);
					}
			}
		}
	}
	

	
	
	public String toString() {
		String result = "";
		for (int i = 0; i < facultiesArray.length; i++) {
			result += "\n" + facultiesArray[i].name;
		}
		return "All faculties : " + result;
	}
}
