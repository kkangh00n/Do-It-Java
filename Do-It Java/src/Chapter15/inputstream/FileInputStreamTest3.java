package Chapter15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("src/Chapter15/input2.txt");	){	
			//����Ʈ ������ ������ �о�帮�� ��Ʈ�� ����
			byte[] bs = new byte[10];		//����Ʈ �迭 ����
			int i;
			while((i = fis.read(bs)) != -1) {		//��Ʈ�����κ��� bs�� ũ�⸸ŭ bs�� �д´�.(i�� ������ ���� �ڷ��� byte ��) -> ������ ���� ������ �ݺ�
				for (int k=0; k<i; k++) {					//����Ʈ �迭�� �ݺ��Ͽ� �о�帰 �� ��ŭ(i��ŭ) �ݺ��Ͽ�
					System.out.print((char)bs[k]);		//����Ѵ�.
				}
				System.out.println(":" + i + "����Ʈ ����");	
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
