package Chapter15.decorator;

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//바이트 단위로 파일을 출력하는 FileOutputStream을, 보조스트림 OutputStreamWriter를 통해 문자로 변환하여 출력!!
		
		try(OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream("src/Chapter15/writer.txt"))){
			isw.write("하람아 사랑해♥\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}

}
