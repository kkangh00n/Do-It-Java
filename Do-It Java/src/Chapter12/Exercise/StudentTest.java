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
			Student std = (Student) obj; //�ٿ�ĳ���� �ʼ�
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
		
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		set.add(new Student("400", "�����"));
		set.add(new Student("100", "���߱�"));
		
		System.out.println(set);
		
	}

}
