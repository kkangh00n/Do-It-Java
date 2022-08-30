package Chapter7.StudentTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentkim = new Student(7004, "김강훈");
		studentkim.addSubject("삼각함수와 그 응용", 85);
		studentkim.addSubject("인공지능", 90);
		studentkim.addSubject("문학으로 배우는 글쓰기", 60);
		
		studentkim.showStudentInfo();
		
		Student studentlee = new Student(7024, "이무성");
		studentlee.addSubject("삼각함수와 그 응용", 90);
		
		studentlee.showStudentInfo();
		
		
	}

}
