package Chapter13.innerclass;

// 익명 클래스

class Outer2{ //외부 클래스
	
	Runnable getRunnable(int i) { 
		int num = 100;
		
		return new Runnable() { //(1)익명 내부 클래스를 이용한 반환 

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(i);
				System.out.println(num);
			}
			
		};
	}
	
	
	Runnable runner = new Runnable() { //(2)익명 내부 클래스를 변수에 대입

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		} 
		
	};
	
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}

}
