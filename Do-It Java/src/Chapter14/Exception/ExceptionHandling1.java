package Chapter14.Exception;

// 입출력 예외 : 예외 처리 하지 않으면 오류가 계속 남음
// 실행 오류 예외 : 예외 처리 하지 않아도 컴파일러애 의해 처리 (0나누기, IndexOutOfBounds)

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try { //예외가 발생할 수 있는 부분
			
			FileInputStream fix = new FileInputStream("a.txt"); //예외 발생 부분
		} catch (FileNotFoundException e) { //예외 처리 부분
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		System.out.println("예외 처리 후 여기도 수행");
	}

}
