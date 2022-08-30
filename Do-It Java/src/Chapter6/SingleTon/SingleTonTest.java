package Chapter6.SingleTon;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon Company1 = SingleTon.getInstance();
		SingleTon Company2 = SingleTon.getInstance();
		
		System.out.println( Company1 == Company2 ); //만들어진 2개의 인스턴스는 static으로 공유되는 같은 인스턴스
	}

}
