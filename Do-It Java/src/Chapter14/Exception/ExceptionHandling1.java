package Chapter14.Exception;

// ����� ���� : ���� ó�� ���� ������ ������ ��� ����
// ���� ���� ���� : ���� ó�� ���� �ʾƵ� �����Ϸ��� ���� ó�� (0������, IndexOutOfBounds)

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try { //���ܰ� �߻��� �� �ִ� �κ�
			
			FileInputStream fix = new FileInputStream("a.txt"); //���� �߻� �κ�
		} catch (FileNotFoundException e) { //���� ó�� �κ�
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		System.out.println("���� ó�� �� ���⵵ ����");
	}

}
