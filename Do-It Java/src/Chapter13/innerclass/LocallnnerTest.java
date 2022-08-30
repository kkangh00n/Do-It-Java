package Chapter13.innerclass;
//외부 클래스 -> 메소드 -> 지역 내부 클래스
class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //반환형 Runnable형인 내부 인스턴스 메소드
		int num = 100; //상수로 바뀜!!
		
		//Runnable 반환을 위해 지역 내부 클래스로 구현
		class MyRunnable implements Runnable{ //지역 내부 클래스 -> 함수 내에서 선언

			int localNum = 10;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("i=" + i); //메소드 매개변수
				System.out.println("num=" + num); //메소드 지역변수
				System.out.println("localNum=" + localNum); //지역 내부 클래스의 인스턴스 변수
				System.out.println("outNum=" + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum=" + Outer.sNum + "(외부 클래스 정적 변수)");
				
			}
			
		}
		return new MyRunnable(); //지역 내부 클래스 반환
	}
}

public class LocallnnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer(); //외부클래스 선언
		Runnable runner = out.getRunnable(10); //외부클래스 인스턴스를 통해 Runnable형 선언
		runner.run();
	}

}
