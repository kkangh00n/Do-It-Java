package Chapter7;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> student = new ArrayList<Student>(); // <���׸���>
		
		student.add(new Student(7001, "�谭��")); 
		student.add(new Student(7003, "�迵��"));
		student.add(new Student(7005, "����"));
		
		System.out.println(student.size()); 
		
		for (Student person:student) {
			person.showStudentInfo();
		}
		
	}

}
