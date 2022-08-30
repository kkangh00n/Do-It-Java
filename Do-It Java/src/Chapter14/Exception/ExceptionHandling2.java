package Chapter14.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {									//예외가 발생할 수 있는 부분
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {		//예외 처리 부분
			System.out.println(e);
			return;
		}finally{ 								//항상 수행되는 부분 (FileInputStream을 이용해 열어 놓은 파일 리소스를 닫아야 함) -> AutoCloseale 인터페이스
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");	//16행 return으로 인해 수행 x
	}

}
