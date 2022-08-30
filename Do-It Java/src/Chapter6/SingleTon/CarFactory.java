package Chapter6.SingleTon;

public class CarFactory {
	private static CarFactory Factory = new CarFactory(); //static으로 설정하여 공장의 객체를 모두가 공유
	
	private CarFactory() {} //private으로 설정하여 함부로 차 공장 객체 생성 할수 없음
	
	public static CarFactory getInstance () 
	{
		if(Factory == null)
		{
			Factory = new CarFactory();
		}
		return Factory;
	}
	
	public Car createCar() {  //공장에서 차를 만들어냄
		Car car = new Car();
		return car;
	}
	
}
