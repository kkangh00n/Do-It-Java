package Chapter12.Exercise;

import java.util.HashSet;

class Student{

	String studentId;
	String Name;
	
	Student(String studentId, String Name){
		this.studentId = studentId;
		this.Name = Name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student) obj; //다운캐스팅 필수
			if(std.studentId == this.studentId) {
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.studentId + ":" + this.Name;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		set.add(new Student("400", "정약용"));
		set.add(new Student("100", "송중기"));
		
		System.out.println(set);
		
	}

}
