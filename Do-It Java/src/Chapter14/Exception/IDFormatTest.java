package Chapter14.Exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{ //����� ���� ���� Ŭ����
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� ����."); 	//������ ���� �߻� -> ������ �߻��� ���ܴ� ȣ��� �κп��� ó���ϵ��� �̷�!(29��)
		}
		else if (userID.length()<8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
		}
	this.userID = userID;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;;
		
		try {						//�̷��� ���ܸ� ó��!!!
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
