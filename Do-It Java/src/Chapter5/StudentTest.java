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
	
	private Subject Math;  // (클래스형 변수 -> subject클래스 오픈) -> 31행
	private Subject English;
	
	public Student()
	{
		// this.name="홍길동" //객체 생성 전이기 때문에 먼저 값 설정 불가
		this("입학 전", "홍길동", 19); // -> this를 통해 바로 밑에 생성자를 불러옴
	} 
	
	public Student(String ID, String Name, int grade) //생성자
	{
		Math = new Subject();  // 생성자를 통해 클래스 만들어줌
		English = new Subject();
		
		this.ID=ID;  // (this 예약어)
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
		System.out.println("학생의 학번 : " + ID);
		System.out.println("학생의 이름 : " + Name);
		System.out.println("학생의 학년 : " + grade);
		System.out.println("학생의 주소 : " + address);
		System.out.println("학생의 듣는 수학과목 : " + Math.Name + "\n점수 :" + Math.score);
		System.out.println("학생의 듣는 영어과목 : " + English.Name + "\n점수 :" + English.score);
	}
}


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("2017E7004", "김강훈", 4);  // 생성자
		student.setAddress("서울시 구로구 개봉로 11길 35-17 302호");  // (정보은닉)public 메소드로 private인 멤버변수 접근
		// student.address="광명사거리역";  // (정보은닉)private인 멤버 변수에 직접적으로 접근 불가능
		
		// 정보은닉 하는 이유? -> 정보의 오류가 발생하지 않게 하기 위해서 ex) 2월 30일
		
		student.setMath("삼각함수", 95);  
		student.setEnglish("기초영문법", 100);
		
		student.Allprint();
		
	}

}
