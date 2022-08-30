package Chapter6.StudentID;
// ���� �ο�
class StudentID{
	private String name;
	private static int serialNum = 7001;
	private int studentID;
	
	public StudentID(String name)
	{
		this.name = name;
		studentID = serialNum;
		serialNum+=2;
	}
	
	public void showID()
	{
		System.out.println(this.name + "�� �й� : " + this.studentID);
	}
	
	public static int getserialNum()  //�ν��Ͻ� �������� �ʾƵ� ��� ������ �޼ҵ� -> 32��
	{
		
		//grade = 4;  // ����, static�޼ҵ忡�� static������ ���������� ��� ����
		// �Ϲݸ޼ҵ�� �ν��Ͻ�����, static����, �������� ��� ��� ����
		return serialNum;
	}
}

public class StudentIDTest {

	public static void main(String[] args) {
		
		System.out.println("���� �ø��� ��ȣ = " + StudentID.getserialNum()); //�ν��Ͻ�.static�޼ҵ庸�ٴ� Ŭ����.static�޼ҵ�� ���
		
		// TODO Auto-generated method stub
		StudentID student1 = new StudentID("�谭��");
		StudentID student2 = new StudentID("�̹���");
		StudentID student3 = new StudentID("�̱��");
		StudentID student4 = new StudentID("������");
		
		student1.showID();
		student2.showID();
		student3.showID();
		student4.showID();
		
	}

}
