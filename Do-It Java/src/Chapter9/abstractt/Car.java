package Chapter9.abstractt;

public abstract class Car {

	public abstract void run(); 
	public abstract void refuel();

	//run과 refuel은 어차피 상속되어져서 재정의(메소드 오버라이딩) 될 것이기 때문에, 구현만 해 놓는다!!!
	// => 추상 클래스를 사용하는 이유
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
}
