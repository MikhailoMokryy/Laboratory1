package lab_package;

import java.io.IOException;

public class Faculty {
	FacultyObject[] departmentArray = new FacultyObject[0];
	FacultyObject[] specialtyArray = new FacultyObject[0];

	String name;

	/**
	 * Constructors
	 */

	public Faculty() {

	}

	public Faculty(String name) {
		this.name = name;
	}

	/**
	 * Adding specialty to array of Specialties
	 */
	public void addFacultyObjectToFaculty(FacultyObject first) {
		if (first.indicator == 1) {
			this.departmentArrayUp();
			this.departmentArray[this.departmentArray.length - 1] = first;
		} else if (first.indicator == 2) {
			this.specialtyArrayUp();
			this.specialtyArray[this.specialtyArray.length - 1] = first;
		} else
			System.out.println("\n\t!!!Something went wrong!!!!");
	}

	/** Increasing the array of specialties */
	private void specialtyArrayUp() {
		int len = specialtyArray.length;
		FacultyObject[] copy = new FacultyObject[len];
		for (int i = 0; i < len; i++) {
			copy[i] = specialtyArray[i];
		}
		specialtyArray = new FacultyObject[len + 1];
		for (int i = 0; i < len; i++) {
			specialtyArray[i] = copy[i];
		}
	}

	private void departmentArrayUp() {
		int len = departmentArray.length;
		FacultyObject[] copy = new FacultyObject[len];
		for (int i = 0; i < len; i++) {
			copy[i] = departmentArray[i];
		}
		departmentArray = new FacultyObject[len + 1];
		for (int i = 0; i < len; i++) {
			departmentArray[i] = copy[i];
		}
	}
	
	public void createNewFacultyObject(FacultyObject object) throws IOException{
		System.out.println("Eneter the name of new "+object.oName);
		String name = DataInput.getString();
		object.name = name;
		addFacultyObjectToFaculty(object);
	}
	
	public String toString(int n) {
		if(n == 1) {
			String result = "";
			for (int i = 0; i < departmentArray.length; i++) {
				result += "\n" + departmentArray[i].name;
			}
			return "All departments : "+result;
		}
		else if (n==2) {
			String result = "";
			for (int i = 0; i < specialtyArray.length; i++) {
				result += "\n" + specialtyArray[i].name;
			}
			return "All specialties : "+result;
		}
		else return "Only 1(Departments) and 2(Specialties) are possible parameters for this method";
	}
}
