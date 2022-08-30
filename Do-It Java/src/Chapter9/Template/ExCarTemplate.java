package Chapter9.Template;

public abstract class ExCarTemplate {

	public abstract void drive(); 
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끈다.");
	}
	
	//템플릿 메소드 : 메소드 실행순서(시나리오) 정의, 하위 클래스에서 재정의 하지 못함 (final)
	final public void run() {  
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	//final 예약어
	// final 변수 : 상수를 의미
	// final 메소드 : 재정의 불가능
	// final 클래스 : 상속 불가능
	
	
}
