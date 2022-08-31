package Chapter15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;		//��Ʈ�� ����
		
		try {
			fis = new FileInputStream("src/Chapter15/input.txt");	//��Ʈ�� ����
			System.out.println(fis.read()); 	//��Ʈ������ ������ �о�帰 �� ���
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			try {
				fis.close();			//���� ��Ʈ�� ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (NullPointerException e) {	//��Ʈ���� null�� ���
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
