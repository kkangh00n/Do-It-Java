package Chapter6.SingleTon;

public class Car {
	private static int serialNum = 10001;
	private int CarNum;
	
	public Car() {
		CarNum = serialNum;
		serialNum++;
	}
	
	public int getCarNum() {
		return CarNum;
	}
}
