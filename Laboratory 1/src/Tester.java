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
			System.out.println("Press :\n1)Work with faculties\n2)Work with Departments/Specialties \n3)Work with Students/Professors");
			int n = DataInput.getInt();
			switch (n) {

			/**
			 * Work with faculties
			 */
			case 1: {
				System.out.println(
						"\nPress :\n1)Add faculty \n2)Delete faculty \n3)Edit faculty \n4)Show all faculties \n0)Exit");
				int n1 = DataInput.getInt();
				switch (n1) {

				/** Adding faculty */
				case 1:
					faculties.facultyCreate();
					break;

				/** Deleting faculty */
				case 2:
					faculties.facultyDelete();
					break;

				/** Edit faculty */
				case 3:
					faculties.facultyEdit();
					break;

				/** Show all faculties */
				case 4:
					System.out.println(faculties.toString());
					break;
				case 0:
					break;
				}
			}
				break;

			/**
			 * Work with department and specialty
			 */
			case 2: {
				boolean stopFO = false;
				System.out.println("Enter the name of faculty : ");
				String fname = DataInput.getString();
				boolean exist = faculties.checkFaculty(fname);
				while (stopFO == false && exist == true) {
					int k;
					k = faculties.positionInArray(fname);
					FacultyObject facultyObject = new Department();
					System.out.println("Press :\n1)Work with Departments\n2)Work with Specialties \n0)Exit");
					int n21 = DataInput.getInt();
					switch (n21) {
					case 1:
						facultyObject = new Department();
						break;
					case 2:
						facultyObject = new Specialty();
						break;
					case 0:
						stopFO = true;
						break;
					}
					boolean stopDS = false;
					while (stopDS == false && stopFO != true) {
						System.out.println("Press: \n1)Create \n2)Delete \n3)Edit \n4)Show all \n0)Exit");
						int n2 = DataInput.getInt();
						switch (n2) {
						case 1:
							faculties.facultiesArray[k].createNewFacultyObject(facultyObject);
							break;
						case 2:
							faculties.facultiesArray[k].deleteFacultyObject(facultyObject);
							break;
						case 3:
							faculties.facultiesArray[k].editFacultyObject(facultyObject);
							break;
						case 4:
							System.out.println(faculties.facultiesArray[k].toString(facultyObject.indicator));
							break;
						case 0:
							stopDS = true;
							break;
						}
					}
				}
			}
				break;
			case 3: {
				boolean stop1 = false;
				while(stop1==false) {
					System.out.println("Press : \n1)Work with students \n2)Work with professors \n0)Exit");
					int in = DataInput.getInt();
					People people = new Student();
					switch(in) {
					case 1:
						people = new Student();
					break;
					case 2:
						people = new Professor();
					break;
					case 0:
						stop1 = true;
					break;
					}
					boolean stop2=false;
					while(stop2 == false && stop1!=true) {
						System.out.println("Press :\n1)Add \n2)Delete  \n3)Edit \n4)Show all \n0)Exit");
						int n3 = DataInput.getInt();
						switch (n3) {
						case 1:
							System.out.println("Enter the faculty of "+people.oName+" : ");
							String facStr = DataInput.getString();
							Faculty faculty = faculties.checkAndSetFaculty(facStr);
							while(faculty==null) {
								System.out.println("There is no such faculty!!!\nPress 0 to exit \n\nEnter the faculty of "+people.oName+" : ");
							}
						break;
						case 2:
							
						break;
						case 3:
							
						break;
						case 4:
							
						break;
						case 0:
							stop2 = true;
						break;
						}
					}
				}
			}
			break;
			}
		}
	}

}