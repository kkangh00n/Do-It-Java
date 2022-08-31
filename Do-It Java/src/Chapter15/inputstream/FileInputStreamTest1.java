package Chapter15.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;		//스트림 선언
		
		try {
			fis = new FileInputStream("src/Chapter15/input.txt");	//스트림 생성
			System.out.println(fis.read()); 	//스트림에서 파일을 읽어드린 후 출력
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			try {
				fis.close();			//열린 스트림 닫음
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} catch (NullPointerException e) {	//스트림이 null인 경우
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
