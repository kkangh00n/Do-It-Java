package Chapter14.Exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){ //사용할 리소스 선언
			//throw new Exception(); //강제 예외 발생
		} catch(Exception e) {
			System.out.println("예외 부분이다.");
		}
		// 예외가 발생하건 안하건 obj의 close 메소드 실행 (finally역할 수행)
	}
}
