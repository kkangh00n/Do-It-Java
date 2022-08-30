package Chapter14.Exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{ //사용자 정의 예외 클래스
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없다."); 	//강제로 예외 발생 -> 하지만 발생된 예외는 호출된 부분에서 처리하도록 미룸!(29행)
		}
		else if (userID.length()<8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
	this.userID = userID;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;;
		
		try {						//미뤄진 예외를 처리!!!
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
