package Chapter7;
// �����ڷ���

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] anyangStudent = new Student[3]; //�迭(������)�� 3���� ����°��� �ν��Ͻ��� 3�� �����ϴ� ���� �ƴϴ�.
		
		anyangStudent[0] = new Student(1001, "James");  //�׷��⶧���� �ν��Ͻ��� 3���� ���� �������־���Ѵ�.
		anyangStudent[1] = new Student(1002, "Tomas");
		anyangStudent[2] = new Student(1003, "Edward");
		
		for (int i=0; i<3; i++)
		{
			anyangStudent[i].showStudentInfo();
		}
	}

}
