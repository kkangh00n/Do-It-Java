package Chapter14.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { //���� ó���� �̷�(throws)
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException �߻�
		Class c = Class.forName(className); 				//ClassNotFoundException �߻�
		return c;
	}
	
	
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		
		//���� ó���� �̷�ٸ� ȣ���� �κп��� ���� ó�� �ؾ���
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ã�� �� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ŭ���� ã�� �� ����");
		} catch (Exception e) { 				//Exception�� ��� ���� Ŭ������ �ֻ���!! ���� �⺻ ���� ó���� �ϴ� Exception����� ���� �Ʒ��� ���ƾ� ��
			System.out.println("�ٸ� ����");
		} finally {
			System.out.println("�ٸ� �͵� ���� ���� �� ����");
		}
	}

}
