package Chapter6.SingleTon;

public class CarFactory {
	private static CarFactory Factory = new CarFactory(); //static���� �����Ͽ� ������ ��ü�� ��ΰ� ����
	
	private CarFactory() {} //private���� �����Ͽ� �Ժη� �� ���� ��ü ���� �Ҽ� ����
	
	public static CarFactory getInstance () 
	{
		if(Factory == null)
		{
			Factory = new CarFactory();
		}
		return Factory;
	}
	
	public Car createCar() {  //���忡�� ���� ����
		Car car = new Car();
		return car;
	}
	
}
