package Chapter15.decorator;

//��Ʈ��ũ�����̳� ���ͳݿ��� �аų� ���� ��Ʈ���� InputStream & OutputStream

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Ʈ ������ ������ �о�帮�� FileInputStream��, ������Ʈ�� InputStreamReader�� ���� ���ڷ� ��ȯ!!
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("src/Chapter15/reader.txt"))) {
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
