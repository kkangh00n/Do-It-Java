package Chapter14.Exception;

public class AutoCloseObj implements AutoCloseable { //FileInputStream의 인터페이스 (AutoCloseable 인터페이스를 구현하여 finally역할 수행)

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("리소스가 close() 됨"); //정상인 경우와 예외 발생한 경우 모두 수행
	}
	
}
