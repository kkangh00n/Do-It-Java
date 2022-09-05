package Chapter15.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("src/Chapter15/output2.txt");
		
		try(fos){			//���� try with resources��(�ڹ� 9) -> ���� ó�� �̷�� ����
			byte[] bs = new byte[26];
			byte data =65;				//A
			
			for(int i=0; i <bs.length; i++) {			//�迭�� ���� �迭�� ũ�⸸ŭ �� ���� ���
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		
		
		
	}
}
