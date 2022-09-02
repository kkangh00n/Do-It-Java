package Chapter15.reader;

//Reader = 문자 단위로 읽는 스트림 중 최상위

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("src/Chapter15/reader.txt");		//문자를 읽어드리는 스트림 생성
		try (fr) {
			int i;
			while((i = fr.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
