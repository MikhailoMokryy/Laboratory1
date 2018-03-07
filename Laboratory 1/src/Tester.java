import java.io.IOException;
import lab_package.*;

/**
 * @author Maxim Rybka ;
 * @author Misha Mokry;
 */

public class Tester {
	public static void main(String[] args) throws IOException {
		Arrays faculties = new Arrays();
		while (true) {
			boolean stop = false;
			System.out.println(
					"Press :\n1)Add/Delete/Edit/Show faculties\n2)Add/Delete/Edit students");
			int n = DataInput.getInt();
			switch (n) {
			/**
			 * Work with students
			 */
			case 1:
				System.out.println(
						"\nPress :\n1)Add faculty \n2)Delete faculty \n3)Edit faculty \n4)Show all faculties");
				int n1 = DataInput.getInt();
				switch (n1) {
				
				/** Adding faculty */
				case 1:
					faculties.facultyCreate();
					break;
					
				/**Deleting faculty*/
				case 2:
					faculties.facultyDelete();
					break;
					
				/**Edit faculty*/
				case 3:
					faculties.facultyEdit();
					break;
					
				/**Show all faculties*/
				case 4:
					System.out.println(faculties.toString());
					break;
				}
				break;
			/**
			 * Work with faculties
			 */
			case 2:
				System.out.println(
						"Press :\n1)Add student \n2)Delete  \n3)Edit student");
				int n2 = DataInput.getInt();
				switch (n2) {
				case 1:
					System.out.println("Enter the name of student :");
					String name = DataInput.getString();
					System.out.println("Enter the faculty : ");
					String facultyN = DataInput.getString();
					Faculty faculty = faculties.checkAndSetFaculty(facultyN);
					while (faculty == null) {
						System.out.println(
								"There is no such faculty !\nTo exit press 0\n\n Enter the faculty : ");
						facultyN = DataInput.getString();
						if (facultyN.charAt(0) == '0') {
							stop = true;
							break;
						}
						faculty = faculties.checkAndSetFaculty(facultyN);
					}
					if (stop == true)
						break;

					System.out.println("Enter the specialty :");
					String specialtyN = DataInput.getString();

					System.out.println("Enter the curse :");
					int course = DataInput.getInt();

					System.out.println("Enter the number of group :");
					int group = DataInput.getInt();

					Student s = new Student(name, faculty, specialtyN, course, group);

					break;
				case 2:
				}

			}
		}
	}

}