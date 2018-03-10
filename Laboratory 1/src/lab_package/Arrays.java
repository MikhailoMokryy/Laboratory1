package lab_package;

import java.io.IOException;

public class Arrays {
	public Faculty[] facultiesArray;

	public Arrays() {
		this.facultiesArray = new Faculty[0];
		Faculty fen = new Faculty("FI");
		setFacultyToAray(fen);
			Specialty fiSpec = new Specialty("SE");
			facultiesArray[0].addFacultyObjectToFaculty(fiSpec, fiSpec.name);
				Student vitya = new Student("Vitya",facultiesArray[0],facultiesArray[0].specialtyArray[0],1,1);
				facultiesArray[0].specialtyArray[0].addStudentToStudentsArray(vitya);
			fiSpec = new Specialty("Aplied Math");
			facultiesArray[0].addFacultyObjectToFaculty(fiSpec, fiSpec.name);
				Student andrey = new Student("Andrey",facultiesArray[0],facultiesArray[0].specialtyArray[0],1,1);
				facultiesArray[0].specialtyArray[1].addStudentToStudentsArray(andrey);
		Faculty fi = new Faculty("FEN");
		setFacultyToAray(fi);
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
	
	public void showAllPeople(People people) throws IOException{
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
				System.out.println("Enter the specialty : ");
				String specName = DataInput.getString();
				facultyObject = new Specialty(specName);
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
					facultiesArray[k].departmentArray[num].toString(people);
				}
				else if(facultyObject.indicator ==2) {
					System.out.println(facultiesArray[k].specialtyArray[num].toString(people));
				}
			}
		}
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
	
	
	
	public String toString() {
		String result = "";
		for (int i = 0; i < facultiesArray.length; i++) {
			result += "\n" + facultiesArray[i].name;
		}
		return "All faculties : " + result;
	}
}
