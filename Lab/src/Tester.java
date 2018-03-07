import java.io.IOException;
import lab_package.*;

/**
 * @author Maxim Rybka ;
 * @author Misha Mokry; �������� ��������, �� ���� ��������� ������ �������� ��
 *         ���������� ����������� ������.
 * 
 *         ³������� ����� ���� ��������� ��� ��������� ������, ��:
 * 
 *         ��������/��������/���������� ���������. ��������/��������/����������
 *         ������� ����������. ������/��������/���������� ��������/��������� ��
 *         �������. ������ ��������/��������� �� ϲ�, ������ ��� ������. �������
 *         ��� �������� ������������� �� �������. ������� ���
 *         ��������/���������� ���������� ������������� �� ��������. �������
 *         ��� �������� ������� ������������� �� �������. ������� ���
 *         ��������/���������� ������� ������������� �� ��������. ������� ���
 *         �������� ������� ��������� �����. ������� ��� �������� �������
 *         ��������� ����� ������������� �� ��������.
 */


public class Tester {
	public static void main(String[] args) throws IOException {
		Arrays faculties = new Arrays();
		while (true) {
			boolean stop = false;
			System.out.println(
					"�������� :\n1)������/��������/����������/������� ���������� \n2)������/��������/���������� ��������");
			int n = DataInput.getInt();
			switch (n) {
			/**
			 * Work with students
			 */
			case 1:
				System.out.println("�������� :\n1)������ ��������� \n2)�������� ��������� \n3)���������� ��������� \n4)������� ���������");
				int n1 = DataInput.getInt();
				switch (n1) {
				/**Create faculty*/
				case 1:
					System.out.println("������ ����� ������ ���������� : ");
					String facultyN1 = DataInput.getString();
					Faculty f = new Faculty(facultyN1);
					faculties.setFacultyToAray(f);
					break;
				case 2:
					
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
				System.out.println("�������� :\n1)������ �������� \n�������� �������� \n���������� ��������");
				int n2 = DataInput.getInt();
				switch (n2) {
				case 1:
					System.out.println("������ ��'� �������� :");
					String name = DataInput.getString();
					System.out.println("������ ��������� :");
					String facultyN = DataInput.getString();
					Faculty faculty = faculties.checkAndSetFaculty(facultyN);
					while (faculty == null) {
						System.out.println("������ ���������� �� ���� !\n��� ����� �������� 0\n\n������ ��������� :");
						facultyN = DataInput.getString();
						if (facultyN.charAt(0) == '0') {
							stop = true;
							break;
						}
						faculty = faculties.checkAndSetFaculty(facultyN);
					}
					if (stop == true)
						break;
					
	
					System.out.println("������ ������������ :");
					String specialtyN = DataInput.getString();
	
					System.out.println("������ ���� :");
					int course = DataInput.getInt();
	
					System.out.println("������ ����� ����� :");
					int group = DataInput.getInt();
	
					Student s = new Student(name, faculty, specialtyN, course, group);
					
					break;
				case 2:
				}

			}
		}
	}

}
