package Chapter7;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name)
	{
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo()
	{
		System.out.println("학번 : " + studentID + " 이름 : " + name);
	}
}
