package Chapter11.Object;

class Student implements Cloneable{
	String name;
	int age;
	int StudentID;
	
	Student(String name, int age, int StudentID){ //생성자
		this.name = name;
		this.age = age;
		this.StudentID = StudentID;	
	}
	
	@Override
	public boolean equals(Object obj) { //equals 재정의
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
		Student student1 = new Student("김강훈", 25, 7004); //학생 2명
		Student student2 = new Student("김강훈", 25, 7004);
		String str1 = "ABC"; //String 클래스
		String str2 = "ABC";
		Integer it = 123; //Integer 클래스
		
		System.out.println("=====toString====="); //String 형으로 변환
		System.out.println(student1.toString()); //클래스 이름 + 해시코드 출력
		System.out.println(str1.toString()); //String 클래스에서 재정의 된 toString() 출력
		System.out.println(it.toString());
		
		System.out.println("=====equals()====="); //boolean
		Student student3 = student1;
		System.out.println(student1.equals(student2)); //분명 같은 학생이지만 false로 출력 -> 14행 재정의
		System.out.println(student1.equals(student3));
		System.out.println(str1.equals(str2)); //String 클래스의 재정의 된 equals 출력
		
		System.out.println("=====hashCode()====="); //두 인스턴스가 같다면 hashcode가 같아야 함(hashcode = 인스턴스 주소) -> 따라서 equals()를 논리적 비교로 재정의 했다면 hashcode()도 재정의
		System.out.println(student1.hashCode()); //equals로 같은 학생이여야 하기 때문에 Student 클래스의 hashCode() 재정의 -> 28행 재정의
		System.out.println(student2.hashCode());
		System.out.println(str1.hashCode()); //String의 재정의 된 hashCode() 호출
		System.out.println(str2.hashCode());
		
		System.out.println("=====clone()====="); //구현해야할 마커 인터페이스와 예외처리
		Student strCopy = (Student)student1.clone();
		System.out.println(student1.equals(strCopy));
		
	}
	
}
