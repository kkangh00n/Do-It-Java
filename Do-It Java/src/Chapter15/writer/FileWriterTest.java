package Chapter15.writer;

//Writer = ���� ������ ���� ��Ʈ�� �� �ֻ���

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("src/Chapter15/writer.txt");		//���ڸ� ����ϴ� ��Ʈ�� ����
		try (fw) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("�ȳ��ϼ���~");
			fw.write("65");
			
			//���ĺ�, �ѱ�, ���� �� ��� ��°���!!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��� �Ϸ�");
	}
}
