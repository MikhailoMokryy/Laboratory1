package lab_package;

public class Specialty {
	Student[] studentArray = new Student[0];
	String sName;

	Specialty() {

	}

	Specialty(String name) {
		this.sName = name;
	}

	public void addStudentsToSpecialty(Student first) {
		this.studentArrayUp();
		this.studentArray[this.studentArray.length - 1] = first;
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
}
