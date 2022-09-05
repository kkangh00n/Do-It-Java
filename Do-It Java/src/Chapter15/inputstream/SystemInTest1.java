package Chapter15.inputstream;

//표준 입출력

import java.io.IOException;	

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 쓰고 enter를 누르세요");
		
		int i;
		try {
			//InputStream이므로 바이트 단위로 읽어들임
			i = System.in.read();		//System.in으로 화면에서 문자입력 
			System.out.println((char)i);
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
