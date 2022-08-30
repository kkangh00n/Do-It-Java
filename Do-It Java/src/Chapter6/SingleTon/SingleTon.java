package Chapter6.SingleTon;

public class SingleTon {

	private static SingleTon Company = new SingleTon(); // static형으로 인스턴스 생성
	
	private SingleTon() {}  // 생성자를 private으로 선언하여 함부로 인스턴스를 만들지 못함
	
	public static SingleTon getInstance() { // private인 생성자를 실행시키는 함수, 만약 인스턴스가 만들어진 상태라면 리턴
		if (Company == null)
		{
			Company = new SingleTon();
		}
		return Company;
	}
}
