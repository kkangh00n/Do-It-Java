package Chapter15.others;

import java.util.Scanner;	//Scanner로 다양한 자료 입력

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //표준 입력으로부터 자료를 읽어들임
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();	//Scanner의 문자를 받는 메소드
		System.out.println("직업 : ");
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int num = scanner.nextInt();	//Scanner의 정수를 받는 메소드
		
		System.out.println(name + '\n' + job + '\n' + num);
	}

}
