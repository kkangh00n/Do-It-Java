package Chapter7.StudentTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentkim = new Student(7004, "�谭��");
		studentkim.addSubject("�ﰢ�Լ��� �� ����", 85);
		studentkim.addSubject("�ΰ�����", 90);
		studentkim.addSubject("�������� ���� �۾���", 60);
		
		studentkim.showStudentInfo();
		
		Student studentlee = new Student(7024, "�̹���");
		studentlee.addSubject("�ﰢ�Լ��� �� ����", 90);
		
		studentlee.showStudentInfo();
		
		
	}

}
