package lab_package;

import java.io.IOException;

public class Arrays {
	public Faculty[] facultiesArray;

	public Arrays() {
		this.facultiesArray = new Faculty[0];
		Faculty fen = new Faculty("FEN");
		setFacultyToAray(fen);
		Faculty fi = new Faculty("FI");
		setFacultyToAray(fi);
		Faculty fpvn = new Faculty("FPVN");
		setFacultyToAray(fpvn);
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
	private int positionInArray(String name) {
		int result = 0;
		for (int i = 0; i < this.facultiesArray.length; i++) {
			boolean equals = DataInput.compareStrings(name, this.facultiesArray[i].fName);
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
			System.out.println("There is no faculty with this name!!!\nTo exit press 0\n\nEnter the name of Faculty to edit :");
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
			boolean equals = DataInput.compareStrings(name, this.facultiesArray[i].fName);
			if (equals == true) {
				result = this.facultiesArray[i];
				break;
			}
		}
		return result;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < facultiesArray.length; i++) {
			result += "\n" + facultiesArray[i].fName;
		}
		return "All faculties : " + result;
	}
}
