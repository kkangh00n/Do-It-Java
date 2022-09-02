package Chapter15.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("src/Chapter15/input.txt");) { //바이트 단위로 파일을 읽어드리는 스트림 선언
			//이것이 가능한 이유 -> FileInputStream의 AutoCloseable이 구현되어 있음
			
			int i;
			while((i=fis.read()) != -1){		//스트림에서 파일을 끝까지 읽어드린 후 출력(파일의 끝에 도달하면 -1을 반환!!)
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
