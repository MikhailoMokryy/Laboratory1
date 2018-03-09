package lab_package;

import java.io.IOException;

public class Faculty {
	public FacultyObject[] departmentArray = new FacultyObject[0];
	public FacultyObject[] specialtyArray = new FacultyObject[0];
	public String name;

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
	public void addFacultyObjectToFaculty(FacultyObject first , String name) {
		if (first.indicator == 1) {
			this.departmentArrayUp();
			this.departmentArray[this.departmentArray.length - 1] = new Department(name);
		} else if (first.indicator == 2) {
			this.specialtyArrayUp();
			this.specialtyArray[this.specialtyArray.length - 1] =new Specialty(name);
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
		System.out.println("Enter the name of new "+object.oName);
		String name =  DataInput.getString();
		addFacultyObjectToFaculty(object , name);
	}
	
	public void deleteFacultyObject(FacultyObject object)throws IOException{
		boolean stop = false;
		System.out.println("Enter the name of"+object.oName+" for deleting : ");
		String name = DataInput.getString();
		object.name = name;
		

		while (checkFacultyObject(object) == false) {
			System.out.println(
					"There is no "+object.oName+" with this name!!!\nTo exit press 0\n\nEnter the name of faculty for deleting : ");
			name = DataInput.getString();
			if (name.charAt(0) == '0') {
				stop = true;
				break;
			}
		}

		if (stop == false) {
			int k = positionInArray(object);
			if(object.indicator==1) {
				if (this.departmentArray.length != 0) {
					FacultyObject[] copy = new FacultyObject[this.departmentArray.length - 1];
					for (int i = 0, n = 0; i < this.departmentArray.length; i++, n++) {
						if (i != k) {
							copy[n] = this.departmentArray[i];
						} else
							n--;
					}
					this.departmentArray = new FacultyObject[copy.length];
					for (int i = 0; i < copy.length; i++) {
						this.departmentArray[i] = copy[i];
					}
				} else
					System.out.println("There is no departments!!!");
			}
			else if(object.indicator==2) {
				if (this.specialtyArray.length != 0) {
					FacultyObject[] copy = new FacultyObject[this.specialtyArray.length - 1];
					for (int i = 0, n = 0; i < this.specialtyArray.length; i++, n++) {
						if (i != k) {
							copy[n] = this.specialtyArray[i];
						} else
							n--;
					}
					this.specialtyArray = new FacultyObject[copy.length];
					for (int i = 0; i < copy.length; i++) {
						this.specialtyArray[i] = copy[i];
					}
				} else
					System.out.println("There is no specialties!!!");
			}
		}
	}
	
	public void editFacultyObject(FacultyObject object) throws IOException{
		System.out.println("Enter the name of "+object.oName+" to edit :");
		String name = DataInput.getString();
		FacultyObject copy = object;
		copy.name = name;
		boolean exist  = checkFacultyObject(copy);
		boolean stop=false;
		while(exist==false) {
			System.out.println("There is no "+object.oName+" with this name!!!\nTo exit press 0 \n\nEnter the name of "+object.oName+" to edit :");
			name = DataInput.getString();
			if (name.charAt(0) == '0') {
				stop = true;
				break;
			}
			exist  = checkFacultyObject(copy);
		}
		if(stop ==false && exist==true) {
			System.out.println("New name :");
			String newName = DataInput.getString();
			if(object.indicator==1) {
				this.departmentArray[positionInArray(object)].name = newName;
			}
			else if(object.indicator==2) {
				this.specialtyArray[positionInArray(object)].name = newName;
			}
			else System.out.println("!!!!Indicator must be only 1 or 2!!!!");
		}
	}
	
	public boolean checkFacultyObject(FacultyObject object) {
		boolean result=false;
		if (object.indicator == 1) {
			for (int i = 0; i < this.departmentArray.length; i++) {
				boolean equals = DataInput.compareStrings(object.name, this.departmentArray[i].name);
				if (equals == true) {
					result = true;
					break;
				}
			}
		}
		else if(object.indicator==2) {
			for (int i = 0; i < this.departmentArray.length; i++) {
				boolean equals = DataInput.compareStrings(object.name, this.specialtyArray[i].name);
				if (equals == true) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public int positionInArray(FacultyObject object) {
		int result = 0;
		if(object.indicator==1) {
			for (int i = 0; i < this.departmentArray.length; i++) {
				boolean equals = DataInput.compareStrings(object.name, this.departmentArray[i].name);
				if (equals == true) {
					result = i;
					break;
				}
			}
		}
		else if(object.indicator==2) {
			for (int i = 0; i < this.specialtyArray.length; i++) {
				boolean equals = DataInput.compareStrings(object.name, this.specialtyArray[i].name);
				if (equals == true) {
					result = i;
					break;
				}
			}
		}
		return result;
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
