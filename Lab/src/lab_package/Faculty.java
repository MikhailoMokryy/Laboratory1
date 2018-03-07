package lab_package;

public class Faculty {
	Specialty[] specialtyArray = new Specialty[0];
	String fName;

	/**
	 * Constructors
	 */

	public Faculty() {

	}

	public Faculty(String name) {
		this.fName = name;
	}

	/**
	 * Adding specialty to array of Specialties
	 */
	public void addSpecialtyToFaculty(Specialty first) {
		this.specialtyArrayUp();
		this.specialtyArray[this.specialtyArray.length - 1] = first;
	}

	/** Increasing the array of specialties */
	private void specialtyArrayUp() {
		int len = specialtyArray.length;
		Specialty[] copy = new Specialty[len];
		for (int i = 0; i < len; i++) {
			copy[i] = specialtyArray[i];
		}
		specialtyArray = new Specialty[len + 1];
		for (int i = 0; i < len; i++) {
			specialtyArray[i] = copy[i];
		}
	}
}
