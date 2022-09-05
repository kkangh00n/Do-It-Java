package Chapter15.outputstream;

//OutputStream = ����Ʈ ������ ���� ��Ʈ�� �� �ֻ��� Ŭ����
//-> ���, ����Ʈ ����, ���

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/output.txt");	) {
			//����Ʈ ������ ������ ����ϴ� ��Ʈ�� ���� -> �ٽ� �����ϸ� ������ ABC �������� ���ο� ABC�� ���� (�̾���� true �Ű����� �ۼ�)
			
			fos.write(65);
			fos.write(66);					//���Ͽ� ���� ����ϰ� ��Ʈ���� �ݴ´�.
			fos.write(67);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
