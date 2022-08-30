package Chapter9.abstractt;
//추상 클래스의 예
public abstract class ExComputer { //추상 메소드를 포함하기 때문에 추상 클래스

	public abstract void display();  //추상 메소드
	public abstract void typing();  //추상 메소드
	
	public void turnOn() {
		System.out.println("전원이 켜짐");
	}
	public void turnOff() {
		System.out.println("전원이 꺼짐");
	}
	
}