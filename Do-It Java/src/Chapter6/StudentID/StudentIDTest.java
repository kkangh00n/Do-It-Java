package Chapter6.StudentID;
// 학점 부여
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
		System.out.println(this.name + "의 학번 : " + this.studentID);
	}
	
	public static int getserialNum()  //인스턴스 선언하지 않아도 사용 가능한 메소드 -> 32행
	{
		
		//grade = 4;  // 오류, static메소드에는 static변수와 지역변수만 사용 가능
		// 일반메소드는 인스턴스변수, static변수, 지역변수 모두 사용 가능
		return serialNum;
	}
}

public class StudentIDTest {

	public static void main(String[] args) {
		
		System.out.println("현재 시리얼 번호 = " + StudentID.getserialNum()); //인스턴스.static메소드보다는 클래스.static메소드로 사용
		
		// TODO Auto-generated method stub
		StudentID student1 = new StudentID("김강훈");
		StudentID student2 = new StudentID("이무성");
		StudentID student3 = new StudentID("이기우");
		StudentID student4 = new StudentID("양희준");
		
		student1.showID();
		student2.showID();
		student3.showID();
		student4.showID();
		
	}

}
