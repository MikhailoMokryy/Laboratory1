package lab_package;

import java.io.IOException;

public class Arrays {
	public Faculty[] facultiesArray;

	public Arrays() {
		this.facultiesArray = new Faculty[0];
		Faculty fen = new Faculty("ФЕН");
		setFacultyToAray(fen);
		Faculty fi = new Faculty("ФІ");
		setFacultyToAray(fi);
		Faculty fpvn = new Faculty("ФПВН");
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
	
	public void facultyDelete() throws IOException{
		int k=0;
		boolean stop =false;
		System.out.println("Введіть назву факультету для видалення");
		String df = DataInput.getString();
		Faculty delFaculty =checkAndSetFaculty(df);
		/***/
		while(delFaculty==null) {
			System.out.println("Такого факультету не існує !\nЩоб вийти натисніть 0\n\nВведіть назву факультету для видалення");
			df = DataInput.getString();
			if (df.charAt(0) == '0') {
				stop = true;
				break;
			}
			delFaculty = null;
			for (int i = 0; i < this.facultiesArray.length; i++) {
				boolean equals = DataInput.compareStrings(df, this.facultiesArray[i].fName);
				if (equals == true) {
					k=i;
					delFaculty = this.facultiesArray[i];
					break;
				}
			}
		}
		if(stop==false) {
			if(facultiesArray.length!=0) {
				Faculty [] copy = new Faculty[facultiesArray.length-1];
				for(int i=0;i<facultiesArray.length;i++) {
					
				}
			}
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
		String result="";
		for(int i=0;i<facultiesArray.length;i++) {
			result+="\n"+facultiesArray[i].fName;
		}
		return "Присутні такі факультети : "+result;
	}
}
