package Chapter15.inputstream;

import java.io.IOException;	

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ĺ� �ϳ��� ���� enter�� ��������");
		
		int i;
		try {
			i = System.in.read();		//System.in���� ȭ�鿡�� �����Է�
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
