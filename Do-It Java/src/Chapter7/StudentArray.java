package Chapter7;
// 참조자료형

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] anyangStudent = new Student[3]; //배열(껍데기)만 3개를 만드는거지 인스턴스를 3개 생성하는 것이 아니다.
		
		anyangStudent[0] = new Student(1001, "James");  //그렇기때문에 인스턴스는 3개를 따로 생성해주어야한다.
		anyangStudent[1] = new Student(1002, "Tomas");
		anyangStudent[2] = new Student(1003, "Edward");
		
		for (int i=0; i<3; i++)
		{
			anyangStudent[i].showStudentInfo();
		}
	}

}
