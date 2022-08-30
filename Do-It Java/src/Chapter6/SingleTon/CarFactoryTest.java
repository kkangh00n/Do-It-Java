package Chapter6.SingleTon;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance(); // 공장 객체 생성
		
		Car mySonata = factory.createCar(); // 공장에서 차 객체들 생성
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}

}
