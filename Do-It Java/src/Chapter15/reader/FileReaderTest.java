package Chapter15.reader;

//Reader = ���� ������ �д� ��Ʈ�� �� �ֻ���

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("src/Chapter15/reader.txt");		//���ڸ� �о�帮�� ��Ʈ�� ����
		try (fr) {
			int i;
			while((i = fr.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
