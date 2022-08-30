package Chapter7;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> student = new ArrayList<Student>(); // <Á¦³×¸¯Çü>
		
		student.add(new Student(7001, "±è°­ÈÆ")); 
		student.add(new Student(7003, "±è¿µÈÆ"));
		student.add(new Student(7005, "±è»ç¶û"));
		
		System.out.println(student.size()); 
		
		for (Student person:student) {
			person.showStudentInfo();
		}
		
	}

}
