package Chapter14.Exception;

public class AutoCloseObj implements AutoCloseable { //FileInputStream�� �������̽� (AutoCloseable �������̽��� �����Ͽ� finally���� ����)

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���ҽ��� close() ��"); //������ ���� ���� �߻��� ��� ��� ����
	}
	
}
