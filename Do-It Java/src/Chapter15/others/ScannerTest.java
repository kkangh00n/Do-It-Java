package Chapter15.others;

import java.util.Scanner;	//Scanner�� �پ��� �ڷ� �Է�

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //ǥ�� �Է����κ��� �ڷḦ �о����
		
		System.out.println("�̸� : ");
		String name = scanner.nextLine();	//Scanner�� ���ڸ� �޴� �޼ҵ�
		System.out.println("���� : ");
		String job = scanner.nextLine();
		System.out.println("��� : ");
		int num = scanner.nextInt();	//Scanner�� ������ �޴� �޼ҵ�
		
		System.out.println(name + '\n' + job + '\n' + num);
	}

}
