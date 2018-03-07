import java.io.IOException;
import lab_package.*;

/**
 * @author Maxim Rybka ;
 * @author Misha Mokry; Написати програму, що буде формувати список студентів та
 *         викладачів університету НаУКМА.
 *
 *         Відповідно мають бути реалізовані такі можливості роботи, як:
 *
 *         Створити/видалити/редагувати факультет. Створити/видалити/редагувати
 *         кафедру факультета. Додати/видалити/редагувати студента/викладача до
 *         кафедри. Знайти студента/викладача за ПІБ, курсом або групою. Вивести
 *         всіх студентів впорядкованих за курсами. Вивести всіх
 *         студентів/викладачів факультета впорядкованих за алфавітом. Вивести
 *         всіх студентів кафедри впорядкованих за курсами. Вивести всіх
 *         студентів/викладачів кафедри впорядкованих за алфавітом. Вивести всіх
 *         студентів кафедри вказаного курсу. Вивести всіх студентів кафедри
 *         вказаного курсу впорядкованих за алфавітом.
 */


public class Tester {
	public static void main(String[] args) throws IOException {
		Arrays faculties = new Arrays();
		while (true) {
			boolean stop = false;
			System.out.println(
					"Натисніть :\n1)Додати/Видалити/Редагувати/Вивести факультети \n2)Додати/Видалити/Редагувати студента");
			int n = DataInput.getInt();
			switch (n) {
				/**
				 * Work with students
				 */
				case 1:
					System.out.println("Натисніть :\n1)Додати факультет \n2)Видалити факультет \n3)Редагувати факультет \n4)Вивести факультет");
					int n1 = DataInput.getInt();
					switch (n1) {
						/**Create faculty*/
						case 1:
							System.out.println("Введіть назву нового факультету : ");
							String facultyN1 = DataInput.getString();
							Faculty f = new Faculty(facultyN1);
							faculties.setFacultyToAray(f);
							break;
						case 2:
							faculties.facultyDelete();
							break;
						case 3:

						case 4:
							System.out.println(faculties.toString());
							break;
					}
					break;
				/**
				 * Work with faculties
				 */
				case 2:
					System.out.println("Натисніть :\n1)Додати студента \nВидалити студента \nРедагувати студента");
					int n2 = DataInput.getInt();
					switch (n2) {
						case 1:
							System.out.println("Введіть ім'я студента :");
							String name = DataInput.getString();
							System.out.println("Введіть факультет :");
							String facultyN = DataInput.getString();
							Faculty faculty = faculties.checkAndSetFaculty(facultyN);
							while (faculty == null) {
								System.out.println("Такого факультету не існує !\nЩоб вийти натисніть 0\n\nВведіть факультет :");
								facultyN = DataInput.getString();
								if (facultyN.charAt(0) == '0') {
									stop = true;
									break;
								}
								faculty = faculties.checkAndSetFaculty(facultyN);
							}
							if (stop == true)
								break;


							System.out.println("Введіть спеціальність :");
							String specialtyN = DataInput.getString();

							System.out.println("Введіть курс :");
							int course = DataInput.getInt();

							System.out.println("Введіть номер групи :");
							int group = DataInput.getInt();

							Student s = new Student(name, faculty, specialtyN, course, group);

							break;
						case 2:
					}

			}
		}
	}

}
