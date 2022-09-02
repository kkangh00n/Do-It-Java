package Chapter15.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/output3.txt");){
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);				//3번째 배열부터 10개만 출력
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
