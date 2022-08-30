package Chapter11.Object;

class Student implements Cloneable{
	String name;
	int age;
	int StudentID;
	
	Student(String name, int age, int StudentID){ //������
		this.name = name;
		this.age = age;
		this.StudentID = StudentID;	
	}
	
	@Override
	public boolean equals(Object obj) { //equals ������
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.age==stu.age && this.StudentID==stu.StudentID){
				return true;
			}
			else 
				return false;
		}
		return false;
	}	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.StudentID;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class ObjectMethodTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student("�谭��", 25, 7004); //�л� 2��
		Student student2 = new Student("�谭��", 25, 7004);
		String str1 = "ABC"; //String Ŭ����
		String str2 = "ABC";
		Integer it = 123; //Integer Ŭ����
		
		System.out.println("=====toString====="); //String ������ ��ȯ
		System.out.println(student1.toString()); //Ŭ���� �̸� + �ؽ��ڵ� ���
		System.out.println(str1.toString()); //String Ŭ�������� ������ �� toString() ���
		System.out.println(it.toString());
		
		System.out.println("=====equals()====="); //boolean
		Student student3 = student1;
		System.out.println(student1.equals(student2)); //�и� ���� �л������� false�� ��� -> 14�� ������
		System.out.println(student1.equals(student3));
		System.out.println(str1.equals(str2)); //String Ŭ������ ������ �� equals ���
		
		System.out.println("=====hashCode()====="); //�� �ν��Ͻ��� ���ٸ� hashcode�� ���ƾ� ��(hashcode = �ν��Ͻ� �ּ�) -> ���� equals()�� ���� �񱳷� ������ �ߴٸ� hashcode()�� ������
		System.out.println(student1.hashCode()); //equals�� ���� �л��̿��� �ϱ� ������ Student Ŭ������ hashCode() ������ -> 28�� ������
		System.out.println(student2.hashCode());
		System.out.println(str1.hashCode()); //String�� ������ �� hashCode() ȣ��
		System.out.println(str2.hashCode());
		
		System.out.println("=====clone()====="); //�����ؾ��� ��Ŀ �������̽��� ����ó��
		Student strCopy = (Student)student1.clone();
		System.out.println(student1.equals(strCopy));
		
	}
	
}
