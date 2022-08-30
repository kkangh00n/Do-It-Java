package Chapter14.Exception;

// 사용자 정의 예외 클래스

public class IDFormatException extends Exception { //원래는 예외 클래스 중 가장 유사한 클래스를 상속!! (가장 상위 클래스 상속받음)
	public IDFormatException(String message) {
		super(message); //예외 상황 메시지 받음
	}
}
