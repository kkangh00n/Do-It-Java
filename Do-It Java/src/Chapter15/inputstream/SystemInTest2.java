package Chapter15.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ĺ� ���� ���� ���� enter�� ��������");
		
		int i;
		try {
			while((i=System.in.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
