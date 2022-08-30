package Chapter6.SingleTon;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance(); // ���� ��ü ����
		
		Car mySonata = factory.createCar(); // ���忡�� �� ��ü�� ����
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}

}
