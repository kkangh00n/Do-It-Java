package Chapter15.decorator;

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Ʈ ������ ������ ����ϴ� FileOutputStream��, ������Ʈ�� OutputStreamWriter�� ���� ���ڷ� ��ȯ�Ͽ� ���!!
		
		try(OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream("src/Chapter15/writer.txt"))){
			isw.write("�϶��� ����آ�\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��� �Ϸ�");
	}

}
