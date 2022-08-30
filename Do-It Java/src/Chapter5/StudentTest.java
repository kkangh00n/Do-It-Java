package Chapter5;

class Subject { 

	String Name;
	int score;
}

class Student {

	private String ID;
	private String Name;
	private int grade;
	private String address;
	
	private Subject Math;  // (Ŭ������ ���� -> subjectŬ���� ����) -> 31��
	private Subject English;
	
	public Student()
	{
		// this.name="ȫ�浿" //��ü ���� ���̱� ������ ���� �� ���� �Ұ�
		this("���� ��", "ȫ�浿", 19); // -> this�� ���� �ٷ� �ؿ� �����ڸ� �ҷ���
	} 
	
	public Student(String ID, String Name, int grade) //������
	{
		Math = new Subject();  // �����ڸ� ���� Ŭ���� �������
		English = new Subject();
		
		this.ID=ID;  // (this �����)
		this.Name = Name;
		this.grade=grade;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setMath(String name, int score)
	{
		this.Math.Name=name;
		this.Math.score=score;
	}
	public void setEnglish(String name, int score)
	{
		English.Name=name;
		English.score=score;
	}
	
	public void Allprint()
	{
		System.out.println("�л��� �й� : " + ID);
		System.out.println("�л��� �̸� : " + Name);
		System.out.println("�л��� �г� : " + grade);
		System.out.println("�л��� �ּ� : " + address);
		System.out.println("�л��� ��� ���а��� : " + Math.Name + "\n���� :" + Math.score);
		System.out.println("�л��� ��� ������� : " + English.Name + "\n���� :" + English.score);
	}
}


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("2017E7004", "�谭��", 4);  // ������
		student.setAddress("����� ���α� ������ 11�� 35-17 302ȣ");  // (��������)public �޼ҵ�� private�� ������� ����
		// student.address="�����Ÿ���";  // (��������)private�� ��� ������ ���������� ���� �Ұ���
		
		// �������� �ϴ� ����? -> ������ ������ �߻����� �ʰ� �ϱ� ���ؼ� ex) 2�� 30��
		
		student.setMath("�ﰢ�Լ�", 95);  
		student.setEnglish("���ʿ�����", 100);
		
		student.Allprint();
		
	}

}
