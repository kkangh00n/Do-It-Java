package Chapter15.inputstream;

//InputStream = 바이트 단위로 읽는 스트림 중 최상위 클래스
//-> 입력, 바이트 단위, 기반

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;		//바이트 단위로 파일을 읽어드리는 스트림 선언
		
		try {
			fis = new FileInputStream("src/Chapter15/input.txt");	//스트림 생성
			System.out.println((char)fis.read()); 	//스트림에서 파일을 한 바이트씩 읽어드린 후 출력
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
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
