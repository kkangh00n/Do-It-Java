package Chapter7.StudentTest;
import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList; // ����ִ� ���� ����Ʈ
	
	public Student(int studentID, String studentName) {  //������
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject();
		subject.setName(subjectName);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo(){
		System.out.println("�̸� :" + this.studentName);
		System.out.println("�й� :" + this.studentID);
		int total = 0;
		
		for (Subject sub:subjectList) {
			System.out.println("�л� "+this.studentName+"�� " + sub.getName() + " ���� ������ : " + sub.getScore() + "�Դϴ�");
			total += sub.getScore();
		}
		System.out.println("�л� "+this.studentName+"��" + " ����� : " + total/subjectList.size() + "�Դϴ�");
		System.out.println("===============");
		
	}
	
}
