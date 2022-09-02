package Chapter15.writer;

//Writer = 문자 단위로 쓰는 스트림 중 최상위

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("src/Chapter15/writer.txt");		//문자를 출력하는 스트림 생성
		try (fw) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("안녕하세용~");
			fw.write("65");
			
			//알파벳, 한글, 숫자 등 모두 출력가능!!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}
}
