package Chapter15.decorator;

//네트워크소켓이나 인터넷에서 읽거나 쓰는 스트림은 InputStream & OutputStream

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//바이트 단위로 파일을 읽어드리는 FileInputStream을, 보조스트림 InputStreamReader를 통해 문자로 변환!!
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("src/Chapter15/reader.txt"))) {
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
