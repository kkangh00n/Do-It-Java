package Chapter15.inputstream;

//ǥ�� �����

import java.io.IOException;	

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ĺ� �ϳ��� ���� enter�� ��������");
		
		int i;
		try {
			//InputStream�̹Ƿ� ����Ʈ ������ �о����
			i = System.in.read();		//System.in���� ȭ�鿡�� �����Է� 
			System.out.println((char)i);
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
