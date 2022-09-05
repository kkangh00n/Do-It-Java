package Chapter15.Fileclass;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("src/Chapter15/newFile.txt");			//해당 경로에 File클래스 생성, 아직 실제 파일이 생성된 것은 아님
		file.createNewFile();										//실제파일 생성
		
		System.out.println(file.isFile());							//파일인지?
		System.out.println(file.isDirectory());						//디렉토리인지?
		System.out.println(file.getName());							//이름
		System.out.println(file.getAbsolutePath());					//파일 경로
		System.out.println(file.getPath());							//파일 경로
		System.out.println(file.canRead());							//읽을 수 있는지
		System.out.println(file.canWrite());						//쓸 수 있는지
		
		file.delete();												//파일 삭제
	}

}
