package Chapter15.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("src/Chapter15/output2.txt");
		
		try(fos){			//향상된 try with resources문(자바 9) -> 예외 처리 미뤄야 가능
			byte[] bs = new byte[26];
			byte data =65;				//A
			
			for(int i=0; i <bs.length; i++) {			//배열을 통해 배열의 크기만큼 한 번에 출력
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
		
		
	}
}
