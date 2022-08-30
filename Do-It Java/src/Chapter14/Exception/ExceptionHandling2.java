package Chapter14.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {									//���ܰ� �߻��� �� �ִ� �κ�
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {		//���� ó�� �κ�
			System.out.println(e);
			return;
		}finally{ 								//�׻� ����Ǵ� �κ� (FileInputStream�� �̿��� ���� ���� ���� ���ҽ��� �ݾƾ� ��) -> AutoCloseale �������̽�
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("�׻� ���� �˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");	//16�� return���� ���� ���� x
	}

}
