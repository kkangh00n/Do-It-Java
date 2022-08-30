package Chapter7.StudentTest;
import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList; // 듣고있는 과목 리스트
	
	public Student(int studentID, String studentName) {  //생성자
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
		System.out.println("이름 :" + this.studentName);
		System.out.println("학번 :" + this.studentID);
		int total = 0;
		
		for (Subject sub:subjectList) {
			System.out.println("학생 "+this.studentName+"의 " + sub.getName() + " 과목 점수는 : " + sub.getScore() + "입니다");
			total += sub.getScore();
		}
		System.out.println("학생 "+this.studentName+"의" + " 평균은 : " + total/subjectList.size() + "입니다");
		System.out.println("===============");
		
	}
	
}
