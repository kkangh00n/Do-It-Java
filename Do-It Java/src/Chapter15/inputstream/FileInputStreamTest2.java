package Chapter15.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("src/Chapter15/input.txt");) { //����Ʈ ������ ������ �о�帮�� ��Ʈ�� ����
			//�̰��� ������ ���� -> FileInputStream�� AutoCloseable�� �����Ǿ� ����
			
			int i;
			while((i=fis.read()) != -1){		//��Ʈ������ ������ ������ �о�帰 �� ���(������ ���� �����ϸ� -1�� ��ȯ!!)
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
