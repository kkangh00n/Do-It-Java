package Chapter15.Fileclass;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/Chapter15/newFile.txt");			//�ش� ��ο� FileŬ���� ����, ���� ���� ������ ������ ���� �ƴ�
		file.createNewFile();										//�������� ����
		
		System.out.println(file.isFile());							//��������?
		System.out.println(file.isDirectory());						//���丮����?
		System.out.println(file.getName());							//�̸�
		System.out.println(file.getAbsolutePath());					//���� ���
		System.out.println(file.getPath());							//���� ���
		System.out.println(file.canRead());							//���� �� �ִ���
		System.out.println(file.canWrite());						//�� �� �ִ���
		
		file.delete();												//���� ����
	}

}
