package Chapter14.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { //예외 처리를 미룸(throws)
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생
		Class c = Class.forName(className); 				//ClassNotFoundException 발생
		return c;
	}
	
	
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		
		//예외 처리를 미뤘다면 호출한 부분에서 예외 처리 해야함
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 찾을 수 없음");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스 찾을 수 없음");
		} catch (Exception e) { 				//Exception은 모든 예외 클래스의 최상위!! 따라서 기본 예외 처리를 하는 Exception블록은 가장 아래에 놓아야 함
			System.out.println("다른 예외");
		} finally {
			System.out.println("다른 것도 문제 있을 수 있음");
		}
	}

}
