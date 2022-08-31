package Chapter15.inputstream;

import java.io.IOException;	

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 쓰고 enter를 누르세요");
		
		int i;
		try {
			i = System.in.read();		//System.in으로 화면에서 문자입력
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
