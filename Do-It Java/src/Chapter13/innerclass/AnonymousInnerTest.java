package Chapter13.innerclass;

// �͸� Ŭ����

class Outer2{ //�ܺ� Ŭ����
	
	Runnable getRunnable(int i) { 
		int num = 100;
		
		return new Runnable() { //(1)�͸� ���� Ŭ������ �̿��� ��ȯ 

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(i);
				System.out.println(num);
			}
			
		};
	}
	
	
	Runnable runner = new Runnable() { //(2)�͸� ���� Ŭ������ ������ ����

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
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
