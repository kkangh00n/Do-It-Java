package Chapter13.innerclass;
//�ܺ� Ŭ���� -> �޼ҵ� -> ���� ���� Ŭ����
class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //��ȯ�� Runnable���� ���� �ν��Ͻ� �޼ҵ�
		int num = 100; //����� �ٲ�!!
		
		//Runnable ��ȯ�� ���� ���� ���� Ŭ������ ����
		class MyRunnable implements Runnable{ //���� ���� Ŭ���� -> �Լ� ������ ����

			int localNum = 10;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("i=" + i); //�޼ҵ� �Ű�����
				System.out.println("num=" + num); //�޼ҵ� ��������
				System.out.println("localNum=" + localNum); //���� ���� Ŭ������ �ν��Ͻ� ����
				System.out.println("outNum=" + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum=" + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
			
		}
		return new MyRunnable(); //���� ���� Ŭ���� ��ȯ
	}
}

public class LocallnnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer(); //�ܺ�Ŭ���� ����
		Runnable runner = out.getRunnable(10); //�ܺ�Ŭ���� �ν��Ͻ��� ���� Runnable�� ����
		runner.run();
	}

}
