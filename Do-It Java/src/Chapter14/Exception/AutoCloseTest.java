package Chapter14.Exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){ //����� ���ҽ� ����
			//throw new Exception(); //���� ���� �߻�
		} catch(Exception e) {
			System.out.println("���� �κ��̴�.");
		}
		// ���ܰ� �߻��ϰ� ���ϰ� obj�� close �޼ҵ� ���� (finally���� ����)
	}
}
