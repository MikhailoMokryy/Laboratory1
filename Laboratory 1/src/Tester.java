import java.io.IOException;
import lab_package.*;

/**
 * @author Maxim Rybka ;
 * @author Misha Mokry;
 */

public class Tester {
	
	private static boolean flag;
	
	public static void main(String[] args) throws IOException {
		Arrays faculties = new Arrays();
		while (true) {
			boolean stop = false;
			System.out.println("Press :\n1)Work with faculties\n2)Work with Departments/Specialties \n3)Work with Students/Professors\n0)Exit");
			int n = DataInput.getInt();
			switch (n) {

			/**
			 * Work with faculties
			 */
			case 0:{
				return;
			}
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
						flag = true;
					break;
					case 2:
						people = new Professor();
						flag = false;
					break;
					case 0:
						stop1 = true;
					break;
					}
					boolean stop2=false;
					while(stop2 == false && stop1!=true) {
						System.out.println("Press :\n1)Add \n2)Delete  \n3)Edit \n4)Show  \n0)Exit");
						int n3 = DataInput.getInt();
						switch (n3) {
						case 1:
							faculties.createPeople(people);
						break;
						case 2:
							faculties.deletePeople(people);
						break;
						case 3:
							faculties.editPeople(people);
						break;
						case 4:
							if(flag==false) {
								Arrays faculties1 = new Arrays();
								faculties1.showPeople(people, 0);
							}else {
							boolean stop3=false;
							while(stop3 ==false &&stop2 !=true) {
							System.out.println("Press : \n1)Show all \n2)Show by course and group \n3)Show by course in increasing order \n4)Show by group in increasing order\n0)Exit");
							int input = DataInput.getInt();
							switch(input) {
							case 1:
								Arrays faculties1 = new Arrays();
								faculties1.showPeople(people, 0);
							break;
							case 2:
								Arrays faculties2 = new Arrays();
								faculties2.showPeople(people, 1);
							break;
							case 3:
								Arrays faculties3 = new Arrays();
								faculties3.showPeople(people, 2);
							break;
							case 4:
								Arrays faculties4 = new Arrays();
								faculties4.showPeople(people, 3);
							break;
							case 0:
								stop3 = true;
								break;
								}
							  }
							}
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