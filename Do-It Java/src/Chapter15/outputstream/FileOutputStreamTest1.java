package Chapter15.outputstream;

//OutputStream = 바이트 단위로 쓰는 스트림 중 최상위 클래스
//-> 출력, 바이트 단위, 기반

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("src/Chapter15/output.txt");	) {
			//바이트 단위로 파일을 출력하는 스트림 생성 -> 다시 실행하면 기존의 ABC 없어지고 새로운 ABC가 쓰임 (이어쓰려면 true 매개변수 작성)
			
			fos.write(65);
			fos.write(66);					//파일에 값을 출력하고 스트림을 닫는다.
			fos.write(67);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
